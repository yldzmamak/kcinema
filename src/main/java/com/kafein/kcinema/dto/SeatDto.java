package com.kafein.kcinema.dto;
import lombok.Data;

@Data
public class SeatDto {
    private int id;
    private String seatName;
    private SalonDto salon;
}
