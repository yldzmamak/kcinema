package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.UserTypeDto;
import com.kafein.kcinema.mapper.UserTypeMapper;
import com.kafein.kcinema.repository.UserTypeRepository;
import com.kafein.kcinema.service.base.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Autowired
    private UserTypeMapper userTypeMapper;

    @Override
    public UserTypeDto save(UserTypeDto userTypeDto) {
        return userTypeMapper.toUserTypeDto(userTypeRepository.save(userTypeMapper.toUserType(userTypeDto)));
    }

    @Override
    public List<UserTypeDto> findAll() {
        return userTypeMapper.toUserTypeDtoList(userTypeRepository.findAll());
    }

    @Override
    public UserTypeDto findById(int id) {
        return userTypeMapper.toUserTypeDto(userTypeRepository.findById(id));
    }
}
