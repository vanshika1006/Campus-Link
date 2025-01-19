package com.sms.StudentManagementSystem.service;

import com.sms.StudentManagementSystem.entities.User;

public interface UserService {
    User validateUser(String username, String password);
    void addUser(User user);
}