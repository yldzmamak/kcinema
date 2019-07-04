package com.kafein.kcinema.controller;


import com.kafein.kcinema.dto.SalonDto;
import com.kafein.kcinema.service.base.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salons")
public class SalonController {
    @Autowired
    private SalonService salonService;

    @ResponseBody
    @GetMapping
    public List<SalonDto> findAll() {
        List<SalonDto> salonDtos = salonService.findAll();
        if(salonDtos.size() == 0){
            throw new IllegalArgumentException("Herhangi bir salon kayıtlı değil.");
        }
        return salonDtos;
    }

    @ResponseBody
    @PostMapping
    public SalonDto save(@RequestBody SalonDto companyDto) {
        return salonService.save(companyDto);
    }

    @ResponseBody
    @GetMapping("/findById")
    public SalonDto findById(@RequestParam("id") int id) {
        SalonDto salonDto = salonService.findById(id);
        if(salonDto == null){
            throw new IllegalArgumentException("Şirket bulunamadı.");
        }
        return salonDto;
    }
}
