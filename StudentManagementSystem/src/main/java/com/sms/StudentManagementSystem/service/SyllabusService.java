package com.sms.StudentManagementSystem.service;

import java.util.List;

import com.sms.StudentManagementSystem.entities.Syllabus;

public interface SyllabusService {
    List<Syllabus> getAllSyllabus();
    Syllabus getSyllabusBySemester(int semester);
    void addSyllabus(Syllabus syllabus);
    String getSyllBySem(int semester);
}
