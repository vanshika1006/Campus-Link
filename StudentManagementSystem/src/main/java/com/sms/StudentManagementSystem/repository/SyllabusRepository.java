package com.sms.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.StudentManagementSystem.entities.Syllabus;

public interface SyllabusRepository extends JpaRepository<Syllabus, Long> {
    Syllabus findBySemester(int semester);
}
