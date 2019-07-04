package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.FilmDto;
import com.kafein.kcinema.service.base.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @ResponseBody
    @GetMapping
    public List<FilmDto> findAll() {
        List<FilmDto> filmDtos = filmService.findAll();
        if(filmDtos.size() == 0){
            throw new IllegalArgumentException("Herhangi bir film kayıtlı değil.");
        }
        return filmDtos;
    }

    @ResponseBody
    @PostMapping
    public FilmDto save(@RequestBody FilmDto companyDto) {
        return filmService.save(companyDto);
    }

    @ResponseBody
    @GetMapping("/findById")
    public FilmDto findById(@RequestParam("id") int id) {
        FilmDto filmDto = filmService.findById(id);
        if(filmDto == null){
            throw new IllegalArgumentException("Film bulunamadı.");
        }
        return filmDto;
    }
}
