package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.UserDto;
import com.kafein.kcinema.mapper.UserMapper;
import com.kafein.kcinema.repository.UserRepository;
import com.kafein.kcinema.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto save(UserDto userDto) {
        return null;
    }

    @Override
    public List<UserDto> findAll() {
        return null;
    }

    @Override
    public UserDto findByid() {
        return null;
    }
}
