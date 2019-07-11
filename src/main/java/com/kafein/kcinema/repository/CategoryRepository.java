package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Category findById(int id);
}
