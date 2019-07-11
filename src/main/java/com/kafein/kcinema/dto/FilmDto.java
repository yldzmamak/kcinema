package com.kafein.kcinema.dto;
import lombok.Data;

@Data
public class FilmDto {
    private int id;
    private String filmName;
    private int duration;
    private CategoryDto category;
}
