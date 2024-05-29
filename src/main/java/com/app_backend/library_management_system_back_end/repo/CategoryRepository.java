package com.app_backend.library_management_system_back_end.repo;

import com.app_backend.library_management_system_back_end.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long> {

}
