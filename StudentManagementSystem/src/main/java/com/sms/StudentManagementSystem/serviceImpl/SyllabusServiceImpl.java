package com.sms.StudentManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.StudentManagementSystem.entities.Syllabus;
import com.sms.StudentManagementSystem.repository.SyllabusRepository;
import com.sms.StudentManagementSystem.service.SyllabusService;

@Service
public class SyllabusServiceImpl implements SyllabusService {

    @Autowired
    private SyllabusRepository syllabusRepository;

    @Override
    public List<Syllabus> getAllSyllabus() {
        return syllabusRepository.findAll();
    }

    @Override
    public Syllabus getSyllabusBySemester(int semester) {
        return (Syllabus) syllabusRepository.findBySemester(semester);
    }

    @Override
    public void addSyllabus(Syllabus syllabus) {
        syllabusRepository.save(syllabus);
    }

    @Override
    public String getSyllBySem(int semester) {
        Syllabus syllabus = (Syllabus) syllabusRepository.findBySemester(semester);
        if (syllabus != null) {
            return syllabus.getPdfUrl(); 
        }
        return null; 
    }
}
