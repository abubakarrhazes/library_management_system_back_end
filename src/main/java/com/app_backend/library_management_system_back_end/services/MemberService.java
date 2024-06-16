package com.app_backend.library_management_system_back_end.services;

import com.app_backend.library_management_system_back_end.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;
}
