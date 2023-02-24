package com.app.bookmyshow.controller;

import com.app.bookmyshow.models.User;
import com.app.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControl {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    User addUser(User user)
    {
        return userService.addUser(user);
    }

    @GetMapping("/allusers")
    List<User> getAllUser()
    {
     return userService.getAllUser();
    }
}
