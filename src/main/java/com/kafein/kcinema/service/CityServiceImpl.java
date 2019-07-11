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
        return cityMapper.toCityDto(cityRepository.save(cityMapper.toCity(cityDto)));
    }

    @Override
    public List<CityDto> findAll() {
        return cityMapper.toCityDtoList(cityRepository.findAll());
    }

    @Override
    public CityDto findById(int id) {
        return cityMapper.toCityDto(cityRepository.findById(id));
    }

    @Override
    public Boolean delete(int id) {
        try {
            cityRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
