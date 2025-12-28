package com.springboot.SpringBootCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringBootCRUD.service.UserService;
import com.springboot.SpringBootCRUD.entity.User;




@RestController
public class UserController {
    @Autowired
    private UserService userService;
    private User user;

    // GET ALL USERS
    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    // GET USER BY ID
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUsersById(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        if (user == null) return ResponseEntity.notFound().build(); //404
        return ResponseEntity.ok(user);
    }

    // CREATE USER
    @PostMapping("/users")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }
    
    // DELETE USER BY ID
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        if (user == null) return ResponseEntity.notFound().build(); // 404
        userService.deleteUser(id);
        return ResponseEntity.noContent().build(); // 204
    }

    // UPDATE USER BY ID
    @PutMapping("/users/{id}")
    public ResponseEntity<User> putUser(
            @PathVariable int id,
            @RequestBody User user) {

        User existingUser = userService.getUserById(id);
        if (existingUser == null) return ResponseEntity.notFound().build(); // 404

        user.setId(id); // PRIMARY KEY
        User updatedUser = userService.saveUser(user);

        return ResponseEntity.ok(updatedUser); // 200
    }
}
