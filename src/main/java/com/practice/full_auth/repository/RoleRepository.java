package com.practice.full_auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.full_auth.models.AppRole;
import com.practice.full_auth.models.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}
