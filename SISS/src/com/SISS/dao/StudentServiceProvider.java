package com.SISS.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.SISS.entity.Course;
import com.SISS.entity.Payment;
import com.SISS.entity.Student;
import com.SISS.entity.Teacher;
import com.SISS.exception.*;

public interface StudentServiceProvider {
    void enrollInCourse(Student student, Course course)
            throws DuplicateEnrollmentException, CourseNotFoundException, StudentNotFoundException, InsufficientFundsException;

 
    void makePayment(Student student, BigDecimal amount, LocalDate paymentDate)
            throws StudentNotFoundException, PaymentValidationException;

    List<Course> getEnrolledCourses(Student student) throws StudentNotFoundException;
    void addCourseToDatabase(Course course);
    void recordPayment(Student student, BigDecimal amount, LocalDateTime paymentDate)
            throws StudentNotFoundException, PaymentValidationException;

    List<Student> getEnrolledStudentsForCourse(Course course) throws SQLException;
    void assignTeacherToCourse(int teacherId, int courseId) throws CourseNotFoundException, TeacherNotFoundException;
    List<Payment> getPayments(Student student) throws SQLException;

    boolean isStudentEnrolledInCourse(int studentId, int courseId);

    void enrollStudentInCourse(Student student, Course course);
    
    Course getCourseById(int courseId) throws CourseNotFoundException;
    
    void addStudentToDatabase(Student student);
    
    List<Student> getAllStudentsFromDatabase() throws SQLException;
    
    Student getStudentById(int studentId) throws SQLException, StudentNotFoundException;
    

    void updateStudentInDatabase(Student student);

    List<Course> getAllCoursesFromDatabase() throws SQLException;

    List<Teacher> getAllTeachersFromDatabase() throws SQLException;

    void displayCourseInfo(List<Course> courses);

    void displayTeacherInfo(List<Teacher> teachers);


}
