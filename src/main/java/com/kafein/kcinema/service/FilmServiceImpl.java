package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.FilmDto;
import com.kafein.kcinema.mapper.FilmMapper;
import com.kafein.kcinema.repository.FilmRepository;
import com.kafein.kcinema.service.base.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public FilmDto save(FilmDto filmDto) {
        return filmMapper.toFilmDto(filmRepository.save(filmMapper.toFilm(filmDto)));
    }

    @Override
    public List<FilmDto> findAll() {
        return filmMapper.toFilmDtoList(filmRepository.findAll());
    }

    @Override
    public FilmDto findById(int id) {
        return filmMapper.toFilmDto(filmRepository.findById(id));
    }
}
