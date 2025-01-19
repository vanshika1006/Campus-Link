package com.sms.StudentManagementSystem.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.StudentManagementSystem.entities.User;
import com.sms.StudentManagementSystem.repository.UserRepository;
import com.sms.StudentManagementSystem.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository; 

    @Override
    public User validateUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password); // You can modify this query as needed
    }

	@Override
	public void addUser(User user) {
		userRepository.save(user);		
	}
}
