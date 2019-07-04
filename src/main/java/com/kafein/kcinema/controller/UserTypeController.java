package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.UserTypeDto;
import com.kafein.kcinema.service.base.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userTypes")
public class UserTypeController {
    @Autowired
    private UserTypeService userTypeService;

    @ResponseBody
    @GetMapping
    public List<UserTypeDto> findAll() {
        List<UserTypeDto> userTypeDtos = userTypeService.findAll();
        if(userTypeDtos.size() == 0){
            throw new IllegalArgumentException("Herhangi bir kullanıcı türü kayıtlı değil.");
        }
        return userTypeDtos;
    }

    @ResponseBody
    @PostMapping
    public UserTypeDto save(@RequestBody UserTypeDto userTypeDto) {
        return userTypeService.save(userTypeDto);
    }

    @ResponseBody
    @GetMapping("/findById")
    public UserTypeDto findById(@RequestParam("id") int id) {
        UserTypeDto userTypeDto = userTypeService.findById(id);
        if(userTypeDto == null){
            throw new IllegalArgumentException("Kullanıcı türü bulunamadı.");
        }
        return userTypeDto;
    }
}
