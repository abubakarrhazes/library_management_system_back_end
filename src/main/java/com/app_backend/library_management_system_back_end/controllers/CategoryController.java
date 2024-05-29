package com.app_backend.library_management_system_back_end.controllers;


import com.app_backend.library_management_system_back_end.domain.Book;
import com.app_backend.library_management_system_back_end.domain.Category;
import com.app_backend.library_management_system_back_end.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")

public class CategoryController {


    @Autowired
    private CategoryService categoryService;

    @GetMapping("/get-all-category")
    public List<Category> getAllCategories(){
        return  categoryService.getAllCategories();
    }

    @GetMapping("/get-category-by-id/{id}")
    public ResponseEntity<Category> getBookById(@PathVariable Long id) {
        Category category = categoryService.getCategoriesByID(id);
        if (category == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(category);
    }

    @PostMapping("/create-category")
    public Category createBook(@RequestBody Category category) {
        return categoryService.addCategories(category);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
