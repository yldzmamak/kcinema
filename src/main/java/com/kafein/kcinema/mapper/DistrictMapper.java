package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.DistrictDto;
import com.kafein.kcinema.model.City;
import com.kafein.kcinema.model.District;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CityMapper.class})
public interface DistrictMapper {

    @Named("toDistrict")
    District toDistrict(DistrictDto districtDto);

    @Named("toDistrictDto")
    DistrictDto toDistrictDto(District district);

    @IterableMapping(qualifiedByName = "toDistrict")
    List<District> toDistrictList(List<DistrictDto> districtDtoList);

    @IterableMapping(qualifiedByName = "toDistrictDto")
    List<DistrictDto> toDistrictDtoList(List<District> districtList);

}
