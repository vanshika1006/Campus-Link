package com.sms.StudentManagementSystem.service;

import java.util.List;

import com.sms.StudentManagementSystem.entities.Course;

public interface CourseService {
    List<Course> getAllCourses();
    void addCourse(Course course);
    List<Course> getCoursesBySemester(int semester);
}
