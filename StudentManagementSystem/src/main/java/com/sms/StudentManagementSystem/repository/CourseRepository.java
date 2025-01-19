package com.sms.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.StudentManagementSystem.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
  
	List<Course> findBySemester(int semester);
}
