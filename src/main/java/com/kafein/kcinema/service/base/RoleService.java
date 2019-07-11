package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.RoleDto;

import java.util.List;

public interface RoleService {
    RoleDto save(RoleDto filmDto);

    List<RoleDto> findAll();

    RoleDto findById(int id);
}
