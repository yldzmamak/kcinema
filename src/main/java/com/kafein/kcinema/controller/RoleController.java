package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.RoleDto;
import com.kafein.kcinema.service.base.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @ResponseBody
    @GetMapping
    public List<RoleDto> findAll() {
        List<RoleDto> roleDtoList = roleService.findAll();
        if(roleDtoList.size() == 0){
            throw new IllegalArgumentException("Herhangi bir role kayıtlı değil.");
        }
        return roleDtoList;
    }

    @ResponseBody
    @PostMapping
    public RoleDto save(@RequestBody RoleDto roleDto) {
        return roleService.save(roleDto);
    }

    @ResponseBody
    @GetMapping("/findById")
    public RoleDto findById(@RequestParam("id") int id) {
        RoleDto roleDto = roleService.findById(id);
        if(roleDto == null){
            throw new IllegalArgumentException("Role bulunamadı.");
        }
        return roleDto;
    }
}
