package com.codeclan.example.FilesAndFoldersHw.controllers;

import com.codeclan.example.FilesAndFoldersHw.models.File;
import com.codeclan.example.FilesAndFoldersHw.models.User;
import com.codeclan.example.FilesAndFoldersHw.repositories.FileRepository;
import com.codeclan.example.FilesAndFoldersHw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/user/{id}")
    public ResponseEntity getUser(@PathVariable Long id) {
        return new ResponseEntity(userRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/user")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        userRepository.save(user);
        return new ResponseEntity(user, HttpStatus.CREATED);
    }

}


