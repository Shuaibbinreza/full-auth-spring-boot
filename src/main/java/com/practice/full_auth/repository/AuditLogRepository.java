package com.practice.full_auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.full_auth.models.AuditLog;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {

    List<AuditLog> findByNoteId(Long id);
}
