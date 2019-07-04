package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.SalonDto;
import com.kafein.kcinema.model.Branch;
import com.kafein.kcinema.model.Salon;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses = {BranchMapper.class})
public interface SalonMapper {
    @Named("toSalon")
    Salon toSalon(SalonDto salonDto);

    @Named("toSalonDto")
    SalonDto toSalonDto(Salon salon);

    @IterableMapping(qualifiedByName = "toSalon")
    List<Salon> toSalonList(List<SalonDto> salonDtoList);

    @IterableMapping(qualifiedByName = "toSalonDto")
    List<SalonDto> toSalonDtoList(List<Salon> salonList);
}
