package com.test.demo.service;

import com.test.demo.model.User;
import com.test.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findUser() {
        return userRepository.findAll();
    }
}
