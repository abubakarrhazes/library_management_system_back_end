package com.app_backend.library_management_system_back_end.domain;

// Publisher.java


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "publishers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
