package com.app.bookmyshow.services;

import com.app.bookmyshow.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User addUser(User user);
    List<User> getAllUser();
    Optional<User> getUserById(Long userId);

    User updateUserById(User user);
    void deleteUser(Long userId);
}
