package com.sampath.miniproject.Repo;

import com.sampath.miniproject.Entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepo extends JpaRepository<Faculty, Long> {
    Faculty findByEmail(String email);
}