package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.TicketDto;
import com.kafein.kcinema.mapper.TicketMapper;
import com.kafein.kcinema.model.Ticket;
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
        return ticketMapper.toTicketDto(ticketRepository.save(ticketMapper.toTicket(ticketDto)));
    }

    @Override
    public List<TicketDto> findAll() {
        return ticketMapper.toTicketDtoList(ticketRepository.findAll());
    }

    @Override
    public TicketDto findById(int id) {
        return ticketMapper.toTicketDto(ticketRepository.findById(id));
    }

    @Override
    public List<Integer> findAllFullSeats(int film_salon_id) {
        return ticketRepository.findAllFullSeats(film_salon_id);
    }

    @Override
    public List<Integer> findAllEmptySeats(int film_salon_id) {
        return ticketRepository.findAllEmptySeats(film_salon_id);
    }
}
