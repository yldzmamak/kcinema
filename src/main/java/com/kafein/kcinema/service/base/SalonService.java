package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.SalonDto;

import java.util.List;

public interface SalonService {
    SalonDto save(SalonDto salonDto);

    List<SalonDto> findAll();

    SalonDto findById(int id);
}
