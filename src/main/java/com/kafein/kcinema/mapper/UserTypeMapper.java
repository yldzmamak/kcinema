package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.UserTypeDto;
import com.kafein.kcinema.model.UserType;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserTypeMapper {
    @Named("toUserType")
    UserType toUserType(UserTypeDto ticketDto);

    @Named("toUserTypeDto")
    UserTypeDto toUserTypeDto(UserType ticket);

    @IterableMapping(qualifiedByName = "toUserType")
    List<UserType> toUserTypeList(List<UserTypeDto> ticketDtoList);

    @IterableMapping(qualifiedByName = "toTicketDto")
    List<UserTypeDto> toUserTypeDtoList(List<UserType> ticketList);
}
