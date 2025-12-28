package com.springboot.SpringBootCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SpringBootCRUD.entity.User;
import com.springboot.SpringBootCRUD.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // CREATE or UPDATE
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // READ ALL
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    // READ BY ID
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    // DELETE
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
