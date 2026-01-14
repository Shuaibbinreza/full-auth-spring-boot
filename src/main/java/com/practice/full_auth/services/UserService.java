package com.practice.full_auth.services;

import java.util.List;

import com.practice.full_auth.dtos.UserDTO;
import com.practice.full_auth.models.User;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);
}