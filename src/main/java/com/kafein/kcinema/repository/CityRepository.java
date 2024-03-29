package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
    City findById(int id);
}
