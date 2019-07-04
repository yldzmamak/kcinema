package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.CityDto;
import com.kafein.kcinema.mapper.CityMapper;
import com.kafein.kcinema.repository.CityRepository;
import com.kafein.kcinema.service.base.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityMapper cityMapper;

    @Override
    public CityDto save(CityDto cityDto) {
        return null;
    }

    @Override
    public List<CityDto> findAll() {
        return null;
    }
}
