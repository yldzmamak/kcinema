package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.TicketDto;
import com.kafein.kcinema.model.Ticket;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TicketService {
    TicketDto save(TicketDto ticketDto);

    List<TicketDto> findAll();

    TicketDto findById(int id);

    List<Integer> findAllFullSeats(int film_salon_id);

    List<Integer> findAllEmptySeats(int film_salon_id);
}
