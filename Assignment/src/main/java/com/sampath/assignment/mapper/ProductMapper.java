package com.sampath.assignment.mapper;

import com.sampath.assignment.dto.ProductDTO;
import com.sampath.assignment.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public Product toModel(ProductDTO dto){
        return Product.builder().price(dto.price()).productName(dto.productName()).build();
    }
}
