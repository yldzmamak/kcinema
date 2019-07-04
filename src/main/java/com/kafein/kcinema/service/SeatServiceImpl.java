package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.SeatDto;
import com.kafein.kcinema.mapper.SeatMapper;
import com.kafein.kcinema.repository.SeatRepository;
import com.kafein.kcinema.service.base.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private SeatMapper seatMapper;

    @Override
    public SeatDto save(SeatDto seatDto) {
        return null;
    }

    @Override
    public List<SeatDto> findAll() {
        return null;
    }

    @Override
    public SeatDto findByid() {
        return null;
    }
}
