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
        if(districtRepository.findByDistrictNameAndCity_Id(districtDto.getDistrictName(),districtDto.getCity().getId()) != null){
            throw new IllegalArgumentException("Bu ilde aynı ilçeden iki tane olamaz.");
        }
        return districtMapper.toDistrictDto(districtRepository.save(districtMapper.toDistrict(districtDto)));
    }

    @Override
    public List<DistrictDto> findAll() {
        return districtMapper.toDistrictDtoList(districtRepository.findAll());
    }

    @Override
    public DistrictDto findById(int id) {
        return districtMapper.toDistrictDto(districtRepository.findById(id));
    }


}
