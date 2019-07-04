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
        return salonMapper.toSalonDto(salonRepository.save(salonMapper.toSalon(salonDto)));
    }

    @Override
    public List<SalonDto> findAll() {
        return salonMapper.toSalonDtoList(salonRepository.findAll());
    }

    @Override
    public SalonDto findById(int id) {
        return salonMapper.toSalonDto(salonRepository.findById(id));
    }
}
