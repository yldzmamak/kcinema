package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.FeeDto;

import java.util.List;

public interface FeeService {
    FeeDto save(FeeDto feeDto);

    List<FeeDto> findAll();

    FeeDto findById(int id);
}
