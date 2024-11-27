package com.sampath.assignment.Controller;

import com.sampath.assignment.Services.CustomerService;
import com.sampath.assignment.dto.CustomerRequest;
import com.sampath.assignment.dto.ProductDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final CustomerService service;

    @GetMapping("/")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("hello");
    }

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody @Valid CustomerRequest request) {
        return ResponseEntity.ok(service.createCustomer(request));
    }

    @GetMapping("/getUser")
    public ResponseEntity<String> getUser(@RequestBody CustomerRequest request) {
        return ResponseEntity.ok(service.getUser(request));
    }

    @PutMapping("/UpdateUser")
    public ResponseEntity<String> UpdateUser(@RequestBody CustomerRequest request) {
        return ResponseEntity.ok(service.UpdateUser(request));
    }

    @DeleteMapping("/DeleteUser")
    public ResponseEntity<String> deleteUser(@RequestBody @Valid CustomerRequest request) {
        return ResponseEntity.ok(service.deleteUser(request));
    }

    @PostMapping("/addProduct")
    public ResponseEntity<String> addProduct(@RequestBody @Valid ProductDTO request) {
        return ResponseEntity.ok(service.addProduct(request));
    }
    @GetMapping("/getProduct")
    public ResponseEntity<String> getProduct(@RequestBody @Valid ProductDTO request) {
        return ResponseEntity.ok(service.getProduct(request));
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid CustomerRequest request) {
        return ResponseEntity.ok(service.login(request));
    }
}