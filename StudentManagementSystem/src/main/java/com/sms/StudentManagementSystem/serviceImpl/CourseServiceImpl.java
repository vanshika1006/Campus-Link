package com.sms.StudentManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.StudentManagementSystem.entities.Course;
import com.sms.StudentManagementSystem.repository.CourseRepository;
import com.sms.StudentManagementSystem.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

	@Override
	public List<Course> getCoursesBySemester(int semester) {
		List<Course> semester2 = courseRepository.findBySemester(semester);
		return semester2;
	}
}
