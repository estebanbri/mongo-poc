package com.example.mongopoc.service;

import com.example.mongopoc.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);
}
