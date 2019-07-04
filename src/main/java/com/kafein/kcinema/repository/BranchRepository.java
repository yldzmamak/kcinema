package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,Integer> {
    Branch findById(int id);
}
