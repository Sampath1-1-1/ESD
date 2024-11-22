package com.sampath.miniproject.service;


import com.sampath.miniproject.security.JwtUtil;
import com.sampath.miniproject.DTO.FacultyRequest;
import com.sampath.miniproject.DTO.LoginRequest;
import com.sampath.miniproject.Entity.Faculty;
import com.sampath.miniproject.Mapper.FacultyMapper;
import com.sampath.miniproject.Repo.FacultyRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FacultyService {

    private final FacultyRepo repo;
    private final FacultyMapper mapper;
    private final PasswordEncoder passwordEncoder; // Inject PasswordEncoder
    private final JwtUtil jwtUtil;

    public String create(FacultyRequest request) {
       Faculty faculty = mapper.toEntity(request);

        // Encrypt the password before saving
        String encryptedPassword = passwordEncoder.encode(faculty.getPassword());
          faculty.setPassword(encryptedPassword);

        repo.save(faculty);
        return "faculty created successfully";
    }

    public String loginChecking(LoginRequest request) {
        Faculty faculty = repo.findByEmail(request.email());

        if (faculty == null) {
            return "Invalid email"; // Return message if faculty not found
        }

        // Check if the password matches
        if (passwordEncoder.matches(request.password(), faculty.getPassword())) {
            // Generate JWT token containing email and facultyId as claims
            String token = jwtUtil.generateToken(faculty.getEmail(), faculty.getFacultyId());
            return token;  // Return the token to be used by the frontend
        } else {
            return "Invalid password";  // Return message if password doesn't match
        }
    }
}
