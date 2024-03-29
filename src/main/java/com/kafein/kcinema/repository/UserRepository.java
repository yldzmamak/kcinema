package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findById(int id);

    User findByUserName(String username);
}
