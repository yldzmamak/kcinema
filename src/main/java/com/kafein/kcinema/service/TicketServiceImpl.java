package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.TicketDto;
import com.kafein.kcinema.mapper.TicketMapper;
import com.kafein.kcinema.repository.TicketRepository;
import com.kafein.kcinema.service.base.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public TicketDto save(TicketDto ticketDto) {
        return null;
    }

    @Override
    public List<TicketDto> findAll() {
        return null;
    }

    @Override
    public TicketDto findByid() {
        return null;
    }
}
