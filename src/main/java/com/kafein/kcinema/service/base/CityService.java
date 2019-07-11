package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.CityDto;

import java.util.List;

public interface CityService {
    CityDto save(CityDto cityDto);

    List<CityDto> findAll();

    CityDto findById(int id);

    Boolean delete(int id);

}
