package com.app_backend.library_management_system_back_end.controllers;


import com.app_backend.library_management_system_back_end.domain.Book;
import com.app_backend.library_management_system_back_end.domain.Publisher;
import com.app_backend.library_management_system_back_end.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/publishers")

public class PublisherController {

    @Autowired
    private PublisherService publisherService;
    @GetMapping("/get-all-publishers")
    public List<Publisher> getAllBooks(){
        return  publisherService.getAllPublishers();

    }

    @GetMapping("/welcome")
    public String welcome(){
        return  "Hello World";

    }

    @GetMapping("/get-publisher-by-id/{id}")
    public ResponseEntity<Publisher> getBookById(@PathVariable Long id) {
        Publisher publisher = publisherService.getPublisherById(id);
        if (publisher == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(publisher);
    }

    @PostMapping("/create-publisher")
    public Publisher createBook(@RequestBody Publisher publisher ) {
        return publisherService.addPublisher(publisher);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        publisherService.deletePublisher(id);
        return ResponseEntity.noContent().build();
    }



}
