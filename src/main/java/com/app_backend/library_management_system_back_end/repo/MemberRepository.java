package com.app_backend.library_management_system_back_end.repo;

import com.app_backend.library_management_system_back_end.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {



}
