package com.kafein.kcinema.dto;

import lombok.Data;

@Data
public class DistrictDto {
    private int id;
    private String districtName;
    private CityDto city;
}
