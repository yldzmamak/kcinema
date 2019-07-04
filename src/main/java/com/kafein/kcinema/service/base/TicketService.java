package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.TicketDto;

import java.util.List;

public interface TicketService {
    TicketDto save(TicketDto ticketDto);

    List<TicketDto> findAll();

    TicketDto findById(int id);
}
