package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.FilmSalon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface FilmSalonRepository extends JpaRepository<FilmSalon,Integer> {
    FilmSalon findById(int id);

    List<FilmSalon> findAllBySalon_Id(int salonId);
}
