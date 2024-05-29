package com.app_backend.library_management_system_back_end.domain;

// Member.java


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "members")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;

    private String address;

    @Column(name = "membership_start_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date membershipStartDate;

    @Column(name = "membership_end_date")
    @Temporal(TemporalType.DATE)
    private Date membershipEndDate;

    @OneToMany(mappedBy = "member")
    private Set<Loan> loans = new HashSet<>();

    @OneToMany(mappedBy = "member")
    private Set<Reservation> reservations = new HashSet<>();

    // Getters and setters
    // (Add all getters and setters here)
}
