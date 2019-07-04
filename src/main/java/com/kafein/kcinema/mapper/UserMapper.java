package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.UserDto;
import com.kafein.kcinema.model.User;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Named("toUser")
    User toUser(UserDto ticketDto);

    @Named("toUserDto")
    UserDto toUserDto(User ticket);

    @IterableMapping(qualifiedByName = "toUser")
    List<User> toUserList(List<UserDto> ticketDtoList);

    @IterableMapping(qualifiedByName = "toUserDto")
    List<UserDto> toUserDtoList(List<User> ticketList);
}
