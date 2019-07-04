package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.FilmSalonDto;

import java.util.List;

public interface FilmSalonService {
    FilmSalonDto save(FilmSalonDto filmSalonDto);

    List<FilmSalonDto> findAll();

    FilmSalonDto findById(int id);
}
