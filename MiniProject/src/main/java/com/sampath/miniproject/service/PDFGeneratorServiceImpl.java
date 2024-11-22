//// PDFGeneratorServiceImpl.java
//package com.sampath.miniproject.service;
//
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.sampath.miniproject.Entity.FacultySalary;
//import org.springframework.stereotype.Service;
//
//import java.io.ByteArrayOutputStream;
//
//@Service
//public class PDFGeneratorServiceImpl implements PDFGeneratorService {
//
//    @Override
//    public void generateSalarySlipPDF(FacultySalary salary, ByteArrayOutputStream outputStream) {
//        Document document = new Document();
//
//        try {
//            PdfWriter.getInstance(document, outputStream);
//            document.open();
//
//            // Add content to the PDF (you can adjust this according to your needs)
//            Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
//            document.add(new Paragraph("Salary Slip", boldFont));
//            document.add(new Paragraph("Faculty ID: " + salary.getFacultyId()));
//            document.add(new Paragraph("Salary Date: " + salary.getSalaryDate()));
//            document.add(new Paragraph("Salary Amount: " + salary.getSalaryAmount()));
//            document.add(new Paragraph("Remarks: " + salary.getRemarks()));
//
//            document.close();
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//    }
//}
