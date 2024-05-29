package com.app_backend.library_management_system_back_end.controllers;


import com.app_backend.library_management_system_back_end.domain.Book;
import com.app_backend.library_management_system_back_end.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {


    @Autowired
    private BookService bookService;

    @GetMapping("/get-all-books")
    public List<Book> getAllBooks(){
        return  bookService.getAllBooks();

    }

    @GetMapping("/welcome")
    public String welcome(){
        return  "Hello World";

    }

    @GetMapping("/get-book-by-id/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookByID(id);
        if (book == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(book);
    }

    @PostMapping("/create-book")
    public Book createBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
