package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.CompanyDto;
import com.kafein.kcinema.model.Company;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel="spring")
public interface CompanyMapper {

    @Named("toCompany")
    Company toCompany(CompanyDto companyDto);

    @Named("toCompanyDto")
    CompanyDto toCompanyDto(Company company);

    @IterableMapping(qualifiedByName = "toCompany")
    List<Company> toCompanyList(List<CompanyDto> companyDtoList);

    @IterableMapping(qualifiedByName = "toCompanyDto")
    List<CompanyDto> toCompanyDtoList(List<Company> companyList);

}
