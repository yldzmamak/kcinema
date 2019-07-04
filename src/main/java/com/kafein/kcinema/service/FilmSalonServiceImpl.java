package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.FilmSalonDto;
import com.kafein.kcinema.mapper.FilmSalonMapper;
import com.kafein.kcinema.repository.FilmSalonRepository;
import com.kafein.kcinema.service.base.FilmSalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmSalonServiceImpl implements FilmSalonService {

    @Autowired
    private FilmSalonRepository filmSalonRepository;

    @Autowired
    private FilmSalonMapper filmSalonMapper;

    @Override
    public FilmSalonDto save(FilmSalonDto filmSalonDto) {
        return filmSalonMapper.toFilmSalonDto(filmSalonRepository.save(filmSalonMapper.toFilmSalon(filmSalonDto)));
    }

    @Override
    public List<FilmSalonDto> findAll() {
        return filmSalonMapper.toFilmSalonDtoList(filmSalonRepository.findAll());
    }

    @Override
    public FilmSalonDto findById(int id) {
        return filmSalonMapper.toFilmSalonDto(filmSalonRepository.findById(id));
    }
}
