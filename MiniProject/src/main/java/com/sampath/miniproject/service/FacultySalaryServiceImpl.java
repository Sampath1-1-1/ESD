////package com.sampath.miniproject.service;
////
////import com.sampath.miniproject.Entity.FacultySalary;
////import com.sampath.miniproject.Repo.FacultySalaryRepository;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////
////import java.util.List;
////
////
////@Service
////public abstract class FacultySalaryServiceImpl implements FacultySalaryService {
////
////    private final FacultySalaryRepository salaryRepository;
////
////    @Autowired
////    public FacultySalaryServiceImpl(FacultySalaryRepository salaryRepository) {
////        this.salaryRepository = salaryRepository;
////    }
////
////    @Override
////    public List<FacultySalary> getAllSalariesByFacultyId(Long facultyId) {
////        return salaryRepository.findByFacultyId(facultyId);
////    }
////
////    @Override
////    public FacultySalary getSalaryByMonthAndYear(Long facultyId, int month, int year) {
////        return salaryRepository.findByFacultyIdAndSalaryDateMonthAndSalaryDateYear(facultyId, month, year);
////
////    }
////
////}
//package com.sampath.miniproject.service;
//
//import com.sampath.miniproject.Entity.FacultySalary;
//import com.sampath.miniproject.Repo.FacultySalaryRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public  abstract class FacultySalaryServiceImpl implements FacultySalaryService {
//
//    private final FacultySalaryRepository salaryRepository;
//
//    @Autowired
//    public FacultySalaryServiceImpl(FacultySalaryRepository salaryRepository) {
//        this.salaryRepository = salaryRepository;
//    }
//
//    @Override
//    public List<FacultySalary> getAllSalariesByFacultyId(Long facultyId) {
//        return salaryRepository.findByFacultyId(facultyId);
//    }
//
//    @Override
//    public FacultySalary getSalaryByMonthAndYear(Long facultyId, int month, int year) {
//        return salaryRepository.findByFacultyIdAndSalaryDateMonthAndSalaryDateYear(facultyId, month, year);
//    }
//}
