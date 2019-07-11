package com.kafein.kcinema.dto;

import java.util.Date;
import lombok.Data;

@Data
public class FilmSalonDto {
    private int id;

    private Date startDate; //2019-07-09T12:00:00Z
    private Date endDate;
    private FilmDto film;
    private SalonDto salon;
}
