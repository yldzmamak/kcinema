package com.kafein.kcinema.controller;


import com.kafein.kcinema.dto.DistrictDto;
import com.kafein.kcinema.model.District;
import com.kafein.kcinema.service.base.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/districts")
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @ResponseBody
    @GetMapping
    public List<DistrictDto> findAll() {
        List<DistrictDto> districtDtoList = districtService.findAll();
        if(districtDtoList.size() == 0){
            throw new IllegalArgumentException("Herhangi bir ilçe kayıtlı değil.");
        }
        return districtDtoList;
    }

    @ResponseBody
    @PostMapping
    public DistrictDto save(@RequestBody DistrictDto districtDto) {

        return districtService.save(districtDto);
    }

    @ResponseBody
    @GetMapping("/findById")
    public DistrictDto findById(@RequestParam("id") int id) {
        DistrictDto districtDto = districtService.findById(id);
        if(districtDto == null){
            throw new IllegalArgumentException("İlçe bulunamadı.");
        }
        return districtDto;
    }
}
