package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType,Integer> {
}
