package com.sampath.assignment.Services;

import com.sampath.assignment.dto.CustomerRequest;
import com.sampath.assignment.dto.ProductDTO;
import com.sampath.assignment.entity.Customer;
import com.sampath.assignment.entity.Product;
import com.sampath.assignment.helper.EncryptPassword;
import com.sampath.assignment.mapper.CustomerMapper;
import com.sampath.assignment.mapper.ProductMapper;
import com.sampath.assignment.repo.CustomerRepo;
import com.sampath.assignment.repo.ProductRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    public final CustomerMapper mapper;
    private final CustomerRepo customerRepo;
    private final ProductMapper productMapper;
    private final ProductRepo productRepo;
    private final EncryptPassword encryptPassword;

    public String createCustomer(@Valid CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        customer.setPassword(encryptPassword.encode(customer.getPassword()));
        customerRepo.save(customer);
        return "Customer Created Successfully";
    }

    public String getUser(CustomerRequest request) {
        Customer customer=customerRepo.findByEmail(request.email()).orElse(null);
        return customer ==null ? "No User Found": customer.toString();
    }

    public String UpdateUser(CustomerRequest request) {
        Customer customer=customerRepo.findByEmail(request.email()).orElse(null);
        if(customer ==null ) { return  "No User Found";}
        customer.setFirstName(request.firstName());
        customer.setLastName(request.lastName());
        customer.setEmail(request.email());
        customer.setPassword(encryptPassword.encode(request.password()));
        customerRepo.save(customer);
       return  "User Updated Succedd Full\n "+ customer.toString();
    }

    public String deleteUser(@Valid CustomerRequest request) {
        Customer customer=customerRepo.findByEmail(request.email()).orElse(null);
        if(customer ==null ) { return  "No User Found";}
        customerRepo.delete(customer);
        return  "User deleted Successfully\n "+ customer.toString();
    }

    public String addProduct( @Valid ProductDTO request) {
        Product product=productMapper.toModel(request);
        productRepo.save(product);
        return "product added successfully";
    }

    public String getProduct(ProductDTO request) {
        List<Product> product=productRepo.findTop2ByPriceRange(request.min(),request.max());
        return product == null ? "no product found": product.toString();
    }
}
