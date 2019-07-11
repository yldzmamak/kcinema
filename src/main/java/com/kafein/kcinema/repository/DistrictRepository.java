package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,Integer> {
    District findById(int id);
    District findByDistrictNameAndCity_Id(String districtName,int id);
    List<District> findAllByCity_Id(int id);
}
