package com.practice.full_auth.services;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

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

    void generatePasswordResetToken(String email);

    void resetPassword(String token, String newPassword);

    Optional<User> findByEmail(String email);

    User registerUser(User user);
}