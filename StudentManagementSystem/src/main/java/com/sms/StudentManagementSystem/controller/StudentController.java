package com.sms.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sms.StudentManagementSystem.entities.Course;
import com.sms.StudentManagementSystem.entities.Syllabus;
import com.sms.StudentManagementSystem.service.CourseService;
import com.sms.StudentManagementSystem.service.SyllabusService;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private SyllabusService syllabusService;
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String studentHome() {
        return "student_home";
    }

    @GetMapping("/courses")
    public String viewCoursePage() {
        return "view-course-student";
    }

    @GetMapping("/courses/semester")
    public String viewCoursesBySemester(@RequestParam int semester, Model model) {
        List<Course> filteredCourses = courseService.getCoursesBySemester(semester);
        model.addAttribute("courses", filteredCourses);
        model.addAttribute("semester", semester);
        return "view-course-student";
    }

    @GetMapping("/syllabus")
    public String viewSyllabusPage() {
        return "view-syllabus-student"; // Initial page with semester selection
    }

    @GetMapping("/syllabus/semester")
    public String viewSyllabusBySemester(@RequestParam int semester, Model model) {
        String syllabusLink = syllabusService.getSyllBySem(semester); // Fetch syllabus link for the semester
        if (syllabusLink != null) {
            model.addAttribute("syllabusLink", syllabusLink);
            model.addAttribute("semester", semester);
        } else {
            model.addAttribute("error", "No syllabus found for Semester " + semester);
        }
        return "view-syllabus-student";
    }
}
