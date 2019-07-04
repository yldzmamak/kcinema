package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.SeatDto;
import com.kafein.kcinema.model.Salon;
import com.kafein.kcinema.model.Seat;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses = {SalonMapper.class})
public interface SeatMapper {
    @Named("toSeat")
    Seat toSeat(SeatDto seatDto);

    @Named("toSeatDto")
    SeatDto toSeatDto(Seat seat);

    @IterableMapping(qualifiedByName = "toSeat")
    List<Seat> toSeatList(List<SeatDto> seatDtoList);

    @IterableMapping(qualifiedByName = "toSeatDto")
    List<SeatDto> toSeatDtoList(List<Seat> seatList);
}
