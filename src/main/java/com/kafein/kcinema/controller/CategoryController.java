package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.CategoryDto;
import com.kafein.kcinema.service.base.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ResponseBody
    @GetMapping
    public List<CategoryDto> findAll(){
        List<CategoryDto> categoryDtoList = categoryService.findAll();
        if(categoryDtoList.size()==0){
            throw new IllegalArgumentException("Herhangi bir kategori kayıtlı değil.");
        }
        return categoryDtoList;
    }

    @ResponseBody
    @GetMapping("findById")
    public CategoryDto findById(@RequestParam("id") int id){
        CategoryDto categoryDto = categoryService.findById(id);
        if(categoryDto== null){
            throw new IllegalArgumentException("Categori bulunamadı.");
        }
        return categoryDto;
    }

    @ResponseBody
    @PostMapping
    public CategoryDto save(@RequestBody CategoryDto categoryDto){
        return categoryService.save(categoryDto);
    }

}
