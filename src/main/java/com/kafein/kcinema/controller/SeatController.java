package com.kafein.kcinema.controller;


import com.kafein.kcinema.dto.CompanyDto;
import com.kafein.kcinema.dto.SeatDto;
import com.kafein.kcinema.service.base.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @ResponseBody
    @GetMapping
    public List<SeatDto> findAll() {
        List<SeatDto> seatDtos = seatService.findAll();
        if(seatDtos.size() == 0){
            throw new IllegalArgumentException("Herhangi bir koltuk kayıtlı değil.");
        }
        return seatDtos;
    }

    @ResponseBody
    @PostMapping
    public SeatDto save(@RequestBody SeatDto seatDto) {
        return seatService.save(seatDto);
    }

    @ResponseBody
    @GetMapping("/findById")
    public SeatDto findById(@RequestParam("id") int id) {
        SeatDto seatDto = seatService.findById(id);
        if(seatDto == null){
            throw new IllegalArgumentException("Koltuk bulunamadı.");
        }
        return seatDto;
    }
}
