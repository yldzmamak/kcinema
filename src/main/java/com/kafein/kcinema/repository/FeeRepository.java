package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.Fee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeeRepository extends JpaRepository<Fee,Integer> {
    Fee findById(int id);
}
