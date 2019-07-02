package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.FilmSalon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmSalonRepository extends JpaRepository<FilmSalon,Integer> {
}
