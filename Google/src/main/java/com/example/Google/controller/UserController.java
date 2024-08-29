package com.example.Google.controller;

import com.example.Google.model.User;
import com.example.Google.service.UserService;


public class UserController {

    private UserService userService = new UserService();

    public User getUser(String userId) {
        return userService.getUserById(userId);
    }
}