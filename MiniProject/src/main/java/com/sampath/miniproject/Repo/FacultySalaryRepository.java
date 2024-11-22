package com.sampath.miniproject.Repo;

import com.sampath.miniproject.Entity.FacultySalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FacultySalaryRepository extends JpaRepository<FacultySalary, Long> {

    // Existing method to find salary history by faculty ID
    List<FacultySalary> findByFacultyId(Long facultyId);


    @Query("SELECT es FROM FacultySalary es WHERE es.facultyId = :facultyId AND MONTH(es.salaryDate) = :month AND YEAR(es.salaryDate) = :year")
    FacultySalary findByFacultyIdAndSalaryDateMonthAndSalaryDateYear(
            @Param("facultyId") Long facultyId,
            @Param("month") int month,
            @Param("year") int year
    );

}

