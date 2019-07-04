package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.TicketDto;
import com.kafein.kcinema.model.*;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses = {UserMapper.class, FeeMapper.class, SeatMapper.class, FilmSalonMapper.class})
public interface TicketMapper {
    @Named("toTicket")
    Ticket toTicket(TicketDto ticketDto);

    @Named("toTicketDto")
    TicketDto toTicketDto(Ticket ticket);

    @IterableMapping(qualifiedByName = "toTicket")
    List<Ticket> toTicketList(List<TicketDto> ticketDtoList);

    @IterableMapping(qualifiedByName = "toTicketDto")
    List<TicketDto> toTicketDtoList(List<Ticket> ticketList);
}
