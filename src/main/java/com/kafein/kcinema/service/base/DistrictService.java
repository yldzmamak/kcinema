package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.DistrictDto;
import com.kafein.kcinema.model.District;

import java.util.List;

public interface DistrictService {
    DistrictDto save(DistrictDto districtDto);

    List<DistrictDto> findAll();

    DistrictDto findById(int id);

    List<DistrictDto> findAllByCity_Id(int id);
}
