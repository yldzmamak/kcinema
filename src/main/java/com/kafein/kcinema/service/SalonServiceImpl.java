package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.SalonDto;
import com.kafein.kcinema.mapper.SalonMapper;
import com.kafein.kcinema.repository.SalonRepository;
import com.kafein.kcinema.service.base.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonServiceImpl implements SalonService {

    @Autowired
    private SalonRepository salonRepository;

    @Autowired
    private SalonMapper salonMapper;

    @Override
    public SalonDto save(SalonDto salonDto) {
        return null;
    }

    @Override
    public List<SalonDto> findAll() {
        return null;
    }

    @Override
    public SalonDto findByid() {
        return null;
    }
}
