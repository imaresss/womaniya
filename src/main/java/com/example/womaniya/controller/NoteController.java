package com.example.womaniya.controller;


import com.example.womaniya.model.Note;
import com.example.womaniya.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired      // Dependency injection
    NoteRepository noteRepository;



    @PostMapping("/notes") // For Post
    public Note createNote(@Valid @RequestBody Note note) {
        return noteRepository.save(note);
    }

    @GetMapping("/notes/{id}") // For get
    public Optional<Note> getNoteById(@PathVariable(value = "id") Long noteId) {
        return noteRepository.findById(noteId);


    }

}

