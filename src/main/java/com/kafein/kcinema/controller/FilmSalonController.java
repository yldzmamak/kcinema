package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.FilmSalonDto;
import com.kafein.kcinema.service.base.FilmSalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmSalon")
public class FilmSalonController {

        @Autowired
        private FilmSalonService filmSalonService;

        @ResponseBody
        @GetMapping
        public List<FilmSalonDto> findAll() {
            List<FilmSalonDto> filmSalonDtoList = filmSalonService.findAll();
            if(filmSalonDtoList.size() == 0){
                throw new IllegalArgumentException("Herhangi bir bilgi kayıtlı değil.");
            }
            return filmSalonDtoList;
        }

        @ResponseBody
        @PostMapping
        public FilmSalonDto save(@RequestBody FilmSalonDto companyDto) {
            return filmSalonService.save(companyDto);
        }

        @ResponseBody
        @GetMapping("/findById")
        public FilmSalonDto findById(@RequestParam("id") int id) {
            FilmSalonDto filmSalonDto = filmSalonService.findById(id);
            if(filmSalonDto == null){
                throw new IllegalArgumentException("Bilgi bulunamadı.");
            }
            return filmSalonDto;
        }
}
