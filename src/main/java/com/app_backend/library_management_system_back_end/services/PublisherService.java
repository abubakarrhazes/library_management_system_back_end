package com.app_backend.library_management_system_back_end.services;


import com.app_backend.library_management_system_back_end.domain.Book;
import com.app_backend.library_management_system_back_end.domain.Publisher;
import com.app_backend.library_management_system_back_end.repo.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;


    public List<Publisher> getAllPublishers(){
        return  publisherRepository.findAll();
    }

    public Publisher getPublisherById(Long id){
        return  publisherRepository.findById(id).orElse(null);
    }
    public Publisher addPublisher(Publisher publisher){
        return  publisherRepository.save(publisher);

    }
    public  void deletePublisher(Long id){
       publisherRepository.deleteById(id);

    }
}
