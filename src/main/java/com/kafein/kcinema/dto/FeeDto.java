package com.kafein.kcinema.dto;

import lombok.Data;

@Data
public class FeeDto {
    private int id;
    private float price;
    private CompanyDto company;
    private UserTypeDto userType;
}
