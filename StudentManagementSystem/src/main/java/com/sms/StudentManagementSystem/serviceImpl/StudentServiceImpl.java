package com.sms.StudentManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.StudentManagementSystem.entities.Student;
import com.sms.StudentManagementSystem.repository.StudentRepository;
import com.sms.StudentManagementSystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

	@Override
	public List<Student> getStudentsBySemester(int semester) {
		List<Student> semester2 = studentRepository.findBySemester(semester);
		return semester2;
	}

}
