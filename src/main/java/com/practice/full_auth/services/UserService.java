package com.practice.full_auth.services;

import java.util.List;

import com.practice.full_auth.dtos.UserDTO;
import com.practice.full_auth.models.Role;
import com.practice.full_auth.models.User;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);

    void updateAccountLockStatus(Long userId, boolean lock);

    List<Role> getAllRoles();

    void updateAccountExpiryStatus(Long userId, boolean expire);

    void updateAccountEnabledStatus(Long userId, boolean enabled);

    void updatePassword(Long userId, String password);

    public void generatePasswordResetToken(String email);
}