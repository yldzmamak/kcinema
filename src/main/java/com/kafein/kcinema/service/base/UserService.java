package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto save(UserDto userDto);

    List<UserDto> findAll();

    UserDto findById(int id);
}
