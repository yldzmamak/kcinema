package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.FilmDto;

import java.util.List;

public interface FilmService {
    FilmDto save(FilmDto filmDto);

    List<FilmDto> findAll();

    FilmDto findByid();
}
