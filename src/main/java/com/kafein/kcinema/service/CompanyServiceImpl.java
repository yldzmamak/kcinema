package com.kafein.kcinema.service;

import com.kafein.kcinema.model.Company;
import com.kafein.kcinema.repository.CompanyRepository;
import com.kafein.kcinema.service.base.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company save(Company company) {
//        company.setName("yıldız");
        return companyRepository.save(company);
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }
}
