package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.FeeDto;
import com.kafein.kcinema.model.Company;
import com.kafein.kcinema.model.Fee;
import com.kafein.kcinema.model.UserType;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CompanyMapper.class, UserTypeMapper.class})
public interface FeeMapper {

    @Named("toFee")
    Fee toFee(FeeDto feeDto);

    @Named("toFeeDto")
    FeeDto toFeeDto(Fee fee);

    @IterableMapping(qualifiedByName = "toFee")
    List<Fee> toFeeList(List<FeeDto> feeDtoList);

    @IterableMapping(qualifiedByName = "toFeeDto")
    List<FeeDto> toFeeDtoList(List<Fee> feeList);
}
