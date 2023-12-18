package com.SISS.main;

import java.util.Scanner;

import com.SISS.controller.SISController;
import com.SISS.dao.StudentServiceProvider;
import com.SISS.entity.*;
import com.SISS.util.MyDBConnection;
import com.SISS.dao.DbStudentServiceProvider;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class MainModule {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = MyDBConnection.getConnection();
        StudentServiceProvider studentServiceProvider = new DbStudentServiceProvider(connection);
        SISController sisController = new SISController(studentServiceProvider);
        
        char continueChoice;
        do {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Enroll Student in Course");
            System.out.println("3. View Student Enrolled Courses");
            System.out.println("4. Make Payment");
            System.out.println("5. View Payments for Student");
            System.out.println("6. Update Student Information");
            System.out.println("7. Assign Teacher to Course");
            System.out.println("8. Record Payment");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Student newStudent = sisController.getStudentInformation();
                    sisController.addStudentToDatabase(newStudent);
                    break;
              
                case 2:
                    System.out.print("Enter Student ID: ");
                    int enrollStudentId = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    int enrollCourseId = scanner.nextInt();
                    sisController.enrollInCourse(enrollStudentId, enrollCourseId);
                    break;
                    
                case 3:
                    System.out.print("Enter Student ID: ");
                    int displayEnrolledStudentId = scanner.nextInt();
                    List<Course> enrolledCourses = sisController.getEnrolledCourses(displayEnrolledStudentId);
                    sisController.displayEnrolledCoursesForStudent(enrolledCourses);
                    break;
                    
                case 4:
                    System.out.print("Enter Student ID: ");
                    int paymentStudentId = scanner.nextInt();
                    System.out.print("Enter Payment Amount: ");
                    BigDecimal paymentAmount = scanner.nextBigDecimal();
                    System.out.print("Enter Payment Date (YYYY-MM-DD): ");
                    String paymentDateString = scanner.next();
                    LocalDate paymentDate = LocalDate.parse(paymentDateString);
                    sisController.makePayment(paymentStudentId, paymentAmount, paymentDate);
                    break;
                    
                case 5:
                    System.out.print("Enter Student ID: ");
                    int displayPaymentStudentId = scanner.nextInt();
                    List<Payment> payments = sisController.getPayments(displayPaymentStudentId);
                    sisController.displayPayments(payments);
                    break;
                    
                case 6:
                    System.out.print("Enter Student ID: ");
                    int updateStudentId = scanner.nextInt();
                    sisController.updateStudentInformation(updateStudentId);
                    break;
            
                case 7:
                    System.out.print("Enter Teacher ID: ");
                    int teacherId = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    int assignCourseId = scanner.nextInt();
                    sisController.assignTeacherToCourse(teacherId, assignCourseId);
                    break;
                    
                case 8:
                    System.out.print("Enter Student ID: ");
                    int recordPaymentStudentId = scanner.nextInt();
                    System.out.print("Enter Payment Amount: ");
                    BigDecimal recordPaymentAmount = scanner.nextBigDecimal();
                    LocalDateTime recordPaymentDate = LocalDateTime.now(); 
                    sisController.recordPayment(recordPaymentStudentId, recordPaymentAmount, recordPaymentDate);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.print("Do you want to continue? (y/n): ");
            continueChoice = scanner.next().charAt(0);

        } while (continueChoice == 'y' || continueChoice == 'Y');

        System.out.println("Exiting the SIS Management System.");
        scanner.close();
    }
}
   
