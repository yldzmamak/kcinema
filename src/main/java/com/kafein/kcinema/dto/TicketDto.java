package com.kafein.kcinema.dto;
import lombok.Data;

@Data
public class TicketDto {
    private int id;
    private UserDto user;
    private FeeDto fee;
    private SeatDto seat;
    private FilmSalonDto filmSalon;
}
