package com.sampath.miniproject.service;

import com.sampath.miniproject.Entity.FacultySalary;

import java.util.List;

public interface FacultySalaryService {

    // Method to fetch all salaries for an faculty
    List<FacultySalary> getAllSalariesByfacultyId(Long facultyId);

    // Method to fetch salary by month and year
    FacultySalary getSalaryByMonthAndYear(Long facultyId, int month, int year);
}
