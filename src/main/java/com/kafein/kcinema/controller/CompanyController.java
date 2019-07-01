package com.kafein.kcinema.controller;

import com.kafein.kcinema.model.Company;
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
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @ResponseBody
    @PostMapping
    public Company save(@RequestBody Company company) {
        return companyService.save(company);
    }

}
