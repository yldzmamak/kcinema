package com.kafein.kcinema.dto;

import lombok.Data;

@Data
public class BranchDto {
    private int id;
    private String branchName;
    private String telNo;
    private String adress;
    private DistrictDto district;
    private CompanyDto company;
}
