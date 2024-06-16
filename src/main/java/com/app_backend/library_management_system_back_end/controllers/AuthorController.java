package com.app_backend.library_management_system_back_end.controllers;


import com.app_backend.library_management_system_back_end.domain.Author;
import com.app_backend.library_management_system_back_end.domain.Category;
import com.app_backend.library_management_system_back_end.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/authors")

public class AuthorController {

    @Autowired
    private AuthorService authorService;
   @GetMapping("/get-all-authors")
    public List<Author> getAllAuthors(){
        return  authorService.getAllAuthors();
    }

    @GetMapping("/get-author-by-id/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id) {
        Author author = authorService.getAuthorById(id);
        if (author == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(author);
    }


    @PostMapping("/create-author")
    public Author createAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        authorService.deleteAuthor(id);
        return ResponseEntity.noContent().build();
    }



}
