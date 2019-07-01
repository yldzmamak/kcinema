package com.kafein.kcinema.service.base;

import com.kafein.kcinema.model.Company;

import java.util.List;

public interface CompanyService {

    Company save(Company company);

    List<Company> findAll();
}
