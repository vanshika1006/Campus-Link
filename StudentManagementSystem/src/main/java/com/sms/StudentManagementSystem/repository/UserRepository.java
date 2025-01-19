package com.sms.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.StudentManagementSystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
