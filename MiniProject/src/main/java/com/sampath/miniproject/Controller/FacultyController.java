package com.sampath.miniproject.Controller;

import com.sampath.miniproject.DTO.FacultyRequest;
import com.sampath.miniproject.DTO.LoginRequest;
import com.sampath.miniproject.service.FacultyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/faculty")
public class FacultyController {

    private final FacultyService facultyService;

    @PostMapping("createFaculty")
    public ResponseEntity<?> createFaculty(@RequestBody @Valid FacultyRequest request) {
        return ResponseEntity.ok(facultyService.create(request));
    }

//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
//        String token = facultyService.loginChecking(request);
//
//        // If token is not empty, return it
//        if (token.startsWith("ey")) { // Check if token starts with "ey" (as JWT tokens typically do)
//            return ResponseEntity.ok(new LoginResponse(token)); // Return the token
//        }
//
//        // If an error message is returned, send it as a response
//        return ResponseEntity.badRequest().body(token);
//    }
@PostMapping("/login")
public ResponseEntity<String> login(@RequestBody @Valid LoginRequest request) {
    return ResponseEntity.ok(service.login(request));
}
}

//This method takes a LoginRequest object as input, which is bound to the incoming JSON request body (@RequestBody).
//The return type is a generic ResponseEntity<?>, which allows returning any type of object in the response body.
