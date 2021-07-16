package com.example.mongopoc.controller;

import com.example.mongopoc.entity.User;
import com.example.mongopoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);
    }

}
