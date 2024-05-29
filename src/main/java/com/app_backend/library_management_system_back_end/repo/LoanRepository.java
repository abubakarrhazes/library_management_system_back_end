package com.app_backend.library_management_system_back_end.repo;

import com.app_backend.library_management_system_back_end.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
