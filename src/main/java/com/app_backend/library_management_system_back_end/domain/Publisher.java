package com.app_backend.library_management_system_back_end.domain;

// Publisher.java


import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long publisherId;

    @Column(nullable = false)
    private String name;

    private String address;

    private String phone;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();

    // Getters and setters
    // (Add all getters and setters here)
}
