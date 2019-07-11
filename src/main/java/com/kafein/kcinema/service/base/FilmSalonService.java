package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.FilmSalonDto;
import com.kafein.kcinema.model.FilmSalon;
import com.kafein.kcinema.model.Ticket;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmSalonService {
    FilmSalonDto save(FilmSalonDto filmSalonDto);

    List<FilmSalonDto> findAll();

    FilmSalonDto findById(int id);

    List<FilmSalonDto> findAllBySalon_Id(int salonId);
}
