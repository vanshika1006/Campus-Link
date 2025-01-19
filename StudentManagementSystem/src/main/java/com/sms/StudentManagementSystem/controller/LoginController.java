package com.sms.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sms.StudentManagementSystem.entities.User;
import com.sms.StudentManagementSystem.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService; 

    
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  
    }

    
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpSession session,Model model) {
        User user = userService.validateUser(username, password);

        if (user != null) {
        	model.addAttribute("user", user.getUsername());
            if ("TEACHER".equals(user.getRole())) {
                return "redirect:/teacher/home";  
            } else if ("STUDENT".equals(user.getRole())) {
                return "redirect:/student/home";  
            }
        }
        model.addAttribute("error", "Invalid username or password");  
        return "login";  
    }
}
