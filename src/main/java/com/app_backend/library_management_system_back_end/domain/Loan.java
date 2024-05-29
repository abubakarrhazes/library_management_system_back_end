package com.app_backend.library_management_system_back_end.domain;

// Loan.java

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "librarian_id")
    private Librarian librarian;

    @Column(name = "loan_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date loanDate;

    @Column(name = "due_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;

    @Column(name = "return_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date returnDate;

    // Getters and setters
    // (Add all getters and setters here)
}
