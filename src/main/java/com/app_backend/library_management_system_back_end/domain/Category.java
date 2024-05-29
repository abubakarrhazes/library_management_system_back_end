package com.app_backend.library_management_system_back_end.domain;



import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(nullable = false)
    private String categoryName;

    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Book> books = new HashSet<>();

    // Getters and setters
    // (Add all getters and setters here)
}
