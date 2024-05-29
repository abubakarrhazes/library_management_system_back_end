package com.app_backend.library_management_system_back_end.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "reservations")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "reservation_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date reservationDate;

    @Column(nullable = false)
    private String status;

    // Getters and setters
    // (Add all getters and setters here)
}