package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.CategoryDto;
import com.kafein.kcinema.mapper.CategoryMapper;
import com.kafein.kcinema.repository.CategoryRepository;
import com.kafein.kcinema.service.base.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return categoryMapper.toCategoryDto(categoryRepository.save(categoryMapper.toCategory(categoryDto)));
    }

    @Override
    public List<CategoryDto> findAll() {
        return categoryMapper.toCategoryDtoList(categoryRepository.findAll());
    }

    @Override
    public CategoryDto findById(int id) {
        return categoryMapper.toCategoryDto(categoryRepository.findById(id));
    }
}
