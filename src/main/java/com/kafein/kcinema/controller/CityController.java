package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.CityDto;
import com.kafein.kcinema.service.base.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @ResponseBody
    @GetMapping
    public List<CityDto> findAll(){
        List<CityDto> cityDtoList = cityService.findAll();
        if(cityDtoList.size()==0){
            throw new IllegalArgumentException("Herhangi bir şehir kayıtlı değil.");
        }
        return cityDtoList;
    }

    @ResponseBody
    @GetMapping("findById")
    public CityDto findById(@RequestParam("id") int id){
        CityDto cityDto = cityService.findById(id);
        if(cityDto== null){
            throw new IllegalArgumentException("Şehir bulunamadı.");
        }
        return cityDto;
    }

    @ResponseBody
    @PostMapping
    public CityDto save(@RequestBody CityDto cityDto){
        return cityService.save(cityDto);
    }

    @ResponseBody
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id){
        return cityService.delete(id);
    }
}
