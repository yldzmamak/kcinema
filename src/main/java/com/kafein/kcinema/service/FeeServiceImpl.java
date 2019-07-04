package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.FeeDto;
import com.kafein.kcinema.mapper.FeeMapper;
import com.kafein.kcinema.repository.FeeRepository;
import com.kafein.kcinema.service.base.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeeServiceImpl implements FeeService {

    @Autowired
    private FeeRepository feeRepository;

    @Autowired
    private FeeMapper feeMapper;

    @Override
    public FeeDto save(FeeDto feeDto) {
        return feeMapper.toFeeDto(feeRepository.save(feeMapper.toFee(feeDto)));
    }

    @Override
    public List<FeeDto> findAll() {
        return feeMapper.toFeeDtoList(feeRepository.findAll());
    }

    @Override
    public FeeDto findById(int id) {
        return feeMapper.toFeeDto(feeRepository.findById(id));
    }
}
