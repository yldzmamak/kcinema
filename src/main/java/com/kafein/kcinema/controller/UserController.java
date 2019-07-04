package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.UserDto;
import com.kafein.kcinema.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping
    public List<UserDto> findAll() {
        List<UserDto> userDtos = userService.findAll();
        if(userDtos.size() == 0){
            throw new IllegalArgumentException("Herhangi bir kullanıcı kayıtlı değil.");
        }
        return userDtos;
    }

    @ResponseBody
    @PostMapping
    public UserDto save(@RequestBody UserDto userDto) {
        return userService.save(userDto);
    }

    @ResponseBody
    @GetMapping("/findById")
    public UserDto findById(@RequestParam("id") int id) {
        UserDto userDto = userService.findById(id);
        if(userDto == null){
            throw new IllegalArgumentException("Kullanıcı bulunamadı.");
        }
        return userDto;
    }
}
