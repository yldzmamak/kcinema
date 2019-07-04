package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.SeatDto;

import java.util.List;

public interface SeatService {
    SeatDto save(SeatDto seatDto);

    List<SeatDto> findAll();

    SeatDto findById(int id);
}
