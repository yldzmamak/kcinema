package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.CityDto;
import com.kafein.kcinema.model.City;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {

    @Named("toCity")
    City toCity(CityDto cityDto);

    @Named("toCityDto")
    CityDto toCityDto(City city);

    @IterableMapping(qualifiedByName = "toCity")
    List<City> toCityList(List<CityDto> cityDtoList);

    @IterableMapping(qualifiedByName = "toCityDto")
    List<CityDto> toCityDtoList(List<City> cityList);
}
