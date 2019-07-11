package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.CompanyDto;
import com.kafein.kcinema.service.base.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @ResponseBody
    @GetMapping
    public List<CompanyDto> findAll() {
        List<CompanyDto> companyDto = companyService.findAll();
        if(companyDto.size() == 0){
            throw new IllegalArgumentException("Herhangi bir şirket kayıtlı değil.");
        }
        return companyDto;
    }

    @ResponseBody
    @PostMapping
    public CompanyDto save(@RequestBody CompanyDto companyDto) {
        return companyService.save(companyDto);
    }

    @ResponseBody
    @GetMapping("/findById")
    public CompanyDto findById(@RequestParam("id") int id) {
        CompanyDto companyDto = companyService.findById(id);
        if(companyDto == null){
            throw new IllegalArgumentException("Şirket bulunamadı.");
        }
        return companyDto;
    }

    @ResponseBody
    @DeleteMapping("/findById")
    public Boolean delete(@RequestParam("id") int id) {
        return companyService.delete(id);
    }

}