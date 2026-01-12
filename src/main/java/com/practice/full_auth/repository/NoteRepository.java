package com.practice.full_auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.full_auth.models.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByOwnerUsername(String ownerUsername);
}
