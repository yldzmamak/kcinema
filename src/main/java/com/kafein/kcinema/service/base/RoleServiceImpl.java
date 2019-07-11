package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.RoleDto;
import com.kafein.kcinema.mapper.RoleMapper;
import com.kafein.kcinema.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public RoleDto save(RoleDto roleDto) {
        return roleMapper.toRoleDto(roleRepository.save(roleMapper.toRole(roleDto)));
    }

    @Override
    public List<RoleDto> findAll() {
        return roleMapper.toRoleDtoList(roleRepository.findAll());
    }

    @Override
    public RoleDto findById(int id) {
        return roleMapper.toRoleDto(roleRepository.findById(id));
    }
}
