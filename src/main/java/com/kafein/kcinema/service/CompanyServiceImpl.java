package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.CompanyDto;
import com.kafein.kcinema.mapper.CompanyMapper;
import com.kafein.kcinema.repository.CompanyRepository;
import com.kafein.kcinema.service.base.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public CompanyDto save(CompanyDto companyDto) {
        return companyMapper.toCompanyDto(companyRepository.save(companyMapper.toCompany(companyDto)));
    }

    @Override
    public List<CompanyDto> findAll() {
        return companyMapper.toCompanyDtoList(companyRepository.findAll());
    }

    @Override
    public CompanyDto findById(int id) {
        return companyMapper.toCompanyDto(companyRepository.findById(id));
    }

    @Override
    @Transactional
    public Boolean delete(int id) {
        try {
            companyRepository.deleteById(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
