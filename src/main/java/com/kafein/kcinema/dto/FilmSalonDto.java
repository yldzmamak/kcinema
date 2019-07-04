package com.kafein.kcinema.dto;

import java.util.Date;
import lombok.Data;

@Data
public class FilmSalonDto {
    private int id;

    private Date startDate;
    private Date endDate;
    private FilmDto film;
    private SalonDto salon;
}
