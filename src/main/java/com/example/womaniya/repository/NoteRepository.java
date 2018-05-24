package com.example.womaniya.repository;

import com.example.womaniya.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
// Here All create , deletion , reading from MYSQL database
}

