package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.CompanyDto;

import java.util.List;

public interface CompanyService {

    CompanyDto save(CompanyDto companyDto);

    List<CompanyDto> findAll();

    CompanyDto findById(int id);

    Boolean delete(int id);
}
