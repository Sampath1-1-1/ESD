package com.sampath.miniproject.Mapper;
import com.sampath.miniproject.Entity.Faculty;
import org.springframework.stereotype.Component;
import com.sampath.miniproject.DTO.FacultyRequest;

@Component
public class FacultyMapper {
    public Faculty toEntity(FacultyRequest request) {
        return Faculty.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .title(request.getTitle())  // Optional field for title
//                .photographPath(request.getPhotographPath())  // Optional field for photograph path
                .build();
    }
}
