package com.kafein.kcinema.dto;
import lombok.Data;

@Data
public class SalonDto {
    private int id;
    private String salonName;
    private BranchDto branch;
}
