package com.sms.StudentManagementSystem.service;

import java.util.List;

import com.sms.StudentManagementSystem.entities.Student;

public interface StudentService {
    List<Student> getAllStudents();
    void addStudent(Student student);
    List<Student> getStudentsBySemester(int semester);
}