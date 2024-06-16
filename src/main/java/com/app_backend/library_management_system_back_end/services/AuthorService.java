package com.app_backend.library_management_system_back_end.services;


import com.app_backend.library_management_system_back_end.domain.Author;
import com.app_backend.library_management_system_back_end.repo.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    // Get All Authors Here

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }
    // Get Authors By ID {id}
    public  Author getAuthorById(Long id){
        return  authorRepository.findById(id).orElse(null);

    }

    // Create A New Author Here
    public  Author saveAuthor(Author author){
        return  authorRepository.save(author);

    }
    // Delete By Author ID
    public void  deleteAuthor(Long id){
        authorRepository.deleteById(id);


    }



}
