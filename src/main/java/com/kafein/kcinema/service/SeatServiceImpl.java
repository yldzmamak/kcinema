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
        return seatMapper.toSeatDto(seatRepository.save(seatMapper.toSeat(seatDto)));
    }

    @Override
    public List<SeatDto> findAll() {
        return seatMapper.toSeatDtoList(seatRepository.findAll());
    }

    @Override
    public SeatDto findById(int id) {
        return seatMapper.toSeatDto(seatRepository.findById(id));
    }
}
