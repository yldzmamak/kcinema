package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.DistrictDto;
import com.kafein.kcinema.mapper.DistrictMapper;
import com.kafein.kcinema.repository.DistrictRepository;
import com.kafein.kcinema.service.base.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public DistrictDto save(DistrictDto districtDto) {
        return null;
    }

    @Override
    public List<DistrictDto> findAll() {
        return null;
    }

    @Override
    public DistrictDto findByid() {
        return null;
    }
}
