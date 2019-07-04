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
        return null;
    }

    @Override
    public List<FilmSalonDto> findAll() {
        return null;
    }

    @Override
    public FilmSalonDto findByid() {
        return null;
    }
}
