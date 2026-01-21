package com.practice.full_auth.services;

import java.util.List;

import com.practice.full_auth.models.AuditLog;
import com.practice.full_auth.models.Note;

public interface AuditLogService {
    void logNoteCreation(String username, Note note);

    void logNoteUpdate(String username, Note note);

    void logNoteDeletion(String username, Long noteId);

    List<AuditLog> getAllAuditLogs();

    List<AuditLog> getAuditLogsForNoteId(Long id);
}

