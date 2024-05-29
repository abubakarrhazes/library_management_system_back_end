package com.app_backend.library_management_system_back_end.services;


import com.app_backend.library_management_system_back_end.domain.Book;
import com.app_backend.library_management_system_back_end.domain.Category;
import com.app_backend.library_management_system_back_end.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired

    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return  bookRepository.findAll();
    }

    public Book getBookByID(Long id){
        return  bookRepository.findById(id).orElse(null);
    }
    public Book addBook(Book book){
        return  bookRepository.save(book);

    }
    public  void deleteBook(Long id){
        bookRepository.deleteById(id);

    }



}
