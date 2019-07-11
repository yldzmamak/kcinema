package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto save(CategoryDto categoryDto);

    List<CategoryDto> findAll();

    CategoryDto findById(int id);
}
