package com.app_backend.library_management_system_back_end.services;


import com.app_backend.library_management_system_back_end.domain.Category;
import com.app_backend.library_management_system_back_end.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return  categoryRepository.findAll();
    }

    public Category getCategoriesByID(Long id){
        return  categoryRepository.findById(id).orElse(null);
    }
    public Category addCategories(Category category){
        return  categoryRepository.save(category);

    }
    public  void deleteCategory(Long id){
         categoryRepository.deleteById(id);

    }
}
