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
        return null;
    }

    @Override
    public List<FeeDto> findAll() {
        return null;
    }

    @Override
    public FeeDto findByid() {
        return null;
    }
}
