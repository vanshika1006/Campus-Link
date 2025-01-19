package com.sms.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.StudentManagementSystem.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	 List<Student> findBySemester(int semester);
}
