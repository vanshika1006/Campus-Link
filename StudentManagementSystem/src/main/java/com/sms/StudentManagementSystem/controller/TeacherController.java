package com.sms.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sms.StudentManagementSystem.entities.Course;
import com.sms.StudentManagementSystem.entities.Student;
import com.sms.StudentManagementSystem.entities.Syllabus;
import com.sms.StudentManagementSystem.entities.User;
import com.sms.StudentManagementSystem.service.CourseService;
import com.sms.StudentManagementSystem.service.StudentService;
import com.sms.StudentManagementSystem.service.SyllabusService;
import com.sms.StudentManagementSystem.service.UserService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private SyllabusService syllabusService;
    
    @Autowired
    private UserService userService;

    
    @GetMapping("/home")
    public String teacherHome() {
        return "teacher-home"; 
    }

   
    @GetMapping("/addStudent")
    public String showAddStudentPage() {
        return "add_student"; 
    }

    
    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute Student student) {
        
        studentService.addStudent(student);

        
        User user = new User();
        user.setUsername(student.getName()); 
        user.setPassword(student.getPassword()); 
        user.setId(student.getId());
        user.setRole("STUDENT");
        userService.addUser(user);

        return "redirect:/teacher/home"; 
    }

    
    @GetMapping("/students")
    public String viewStudentsPage() {
                return "view_students";
    }

        @GetMapping("/students/semester")
    public String viewStudentsBySemester(@RequestParam int semester, Model model) {
        List<Student> filteredStudents = studentService.getStudentsBySemester(semester);
        model.addAttribute("students", filteredStudents); 
        model.addAttribute("semester", semester); 
        return "view_students"; 
    }

    @GetMapping("/addCourse")
    public String showAddCoursePage() {
        return "add_course"; 
    }
    @PostMapping("/addCourse")
    public String addCourse(@ModelAttribute Course course) {
        courseService.addCourse(course);
        return "redirect:/teacher/home"; 
    }

    @GetMapping("/courses")
    public String viewCoursePage() {
        return "view_course";
    }
    
    @GetMapping("/courses/semester")
    public String viewCoursesBySemester(@RequestParam int semester, Model model) {
        List<Course> filteredCourses = courseService.getCoursesBySemester(semester);
        model.addAttribute("courses", filteredCourses); 
        model.addAttribute("semester", semester); 
        return "view_course"; 
    }
    
    @GetMapping("/addSyllabus")
    public String showAddSyllabusPage() {
        return "add_syllabus"; 
    }

    @PostMapping("/addSyllabus")
    public String addSyllabus(@ModelAttribute Syllabus syllabus) {
        syllabusService.addSyllabus(syllabus); 
        return "redirect:/teacher/home"; 
    }

    @GetMapping("/viewSyllabus")
    public String viewSyllabus(Model model) {
        model.addAttribute("syllabusList", syllabusService.getAllSyllabus()); 
        return "view_syllabus"; 
    }
}
