package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findById(int id);
}
