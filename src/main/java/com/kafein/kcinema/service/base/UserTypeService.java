package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.UserTypeDto;

import java.util.List;

public interface UserTypeService {
    UserTypeDto save(UserTypeDto userTypeDto);

    List<UserTypeDto> findAll();

    UserTypeDto findByid();
}
