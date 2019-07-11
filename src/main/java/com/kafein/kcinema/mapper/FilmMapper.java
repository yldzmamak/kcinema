package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.FilmDto;
import com.kafein.kcinema.mapper.CategoryMapper;
import com.kafein.kcinema.model.Film;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class})
public interface FilmMapper {
    @Named("toFilm")
    Film toFilm(FilmDto filmDto);

    @Named("toFilmDto")
    FilmDto toFilmDto(Film film);

    @IterableMapping(qualifiedByName = "toFilm")
    List<Film> toFilmList(List<FilmDto> filmDtoList);

    @IterableMapping(qualifiedByName = "toFilmDto")
    List<FilmDto> toFilmDtoList(List<Film> filmList);
}
