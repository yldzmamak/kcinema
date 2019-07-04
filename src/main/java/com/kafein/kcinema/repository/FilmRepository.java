package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film,Integer> {
    Film findById(int id);
}