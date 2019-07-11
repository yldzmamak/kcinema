package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.CategoryDto;
import com.kafein.kcinema.model.Category;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Named("toCategory")
    Category toCategory(CategoryDto categoryDto);

    @Named("toCategoryDto")
    CategoryDto toCategoryDto(Category category);

    @IterableMapping(qualifiedByName = "toCategory")
    List<Category> toCategoryList(List<CategoryDto> categoryDtoList);

    @IterableMapping(qualifiedByName = "toCategoryDto")
    List<CategoryDto> toCategoryDtoList(List<Category> categoryList);

}
