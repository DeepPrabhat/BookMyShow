package com.app.bookmyshow.services;

import com.app.bookmyshow.models.Seat;
import com.app.bookmyshow.models.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getAllUser();
    User getUserById(Long userId);
    User deleteUser(Long userId);
}
