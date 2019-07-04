package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.FilmSalonDto;
import com.kafein.kcinema.model.Film;
import com.kafein.kcinema.model.FilmSalon;
import com.kafein.kcinema.model.Salon;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses = {FilmMapper.class, SalonMapper.class})
public interface FilmSalonMapper {
    @Named("toFilmSalon")
    FilmSalon toFilmSalon(FilmSalonDto filmSalonDto);

    @Named("toFilmSalonDto")
    FilmSalonDto toFilmSalonDto(FilmSalon filmSalon);

    @IterableMapping(qualifiedByName = "toFilmSalon")
    List<FilmSalon> toFilmSalonList(List<FilmSalonDto> filmSalonDtoList);

    @IterableMapping(qualifiedByName = "toFilmSalonDto")
    List<FilmSalonDto> toFilmSalonDtoList(List<FilmSalon> filmSalonList);
}
