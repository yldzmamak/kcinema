package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.FilmSalonDto;
import com.kafein.kcinema.mapper.FilmMapper;
import com.kafein.kcinema.mapper.FilmSalonMapper;
import com.kafein.kcinema.model.Ticket;
import com.kafein.kcinema.repository.FilmRepository;
import com.kafein.kcinema.repository.FilmSalonRepository;
import com.kafein.kcinema.service.base.FilmSalonService;
import org.mapstruct.ap.shaded.freemarker.template.utility.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class FilmSalonServiceImpl implements FilmSalonService {
    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private FilmMapper filmMapper;

    @Autowired
    private FilmSalonRepository filmSalonRepository;

    @Autowired
    private FilmSalonMapper filmSalonMapper;

    @Override
    public FilmSalonDto save(FilmSalonDto filmSalonDto) {
        int duration = filmRepository.findById(filmSalonDto.getFilm().getId()).getDuration();
        int hour=duration/60;
        int minute = duration%60;
        Calendar cal = Calendar.getInstance();
        cal.setTime(filmSalonDto.getStartDate());
        cal.add(Calendar.HOUR,hour);
        cal.add(Calendar.MINUTE,minute);
        Date date = cal.getTime();
        filmSalonDto.setEndDate(date);
        for (FilmSalonDto incomingDTO : findAllBySalon_Id(filmSalonDto.getSalon().getId())){
            if((filmSalonDto.getStartDate().after(incomingDTO.getStartDate()) && filmSalonDto.getStartDate().before(incomingDTO.getEndDate()))
                    || (filmSalonDto.getEndDate().after(incomingDTO.getStartDate()) && filmSalonDto.getEndDate().before(incomingDTO.getEndDate()))
                    || (incomingDTO.getStartDate().after(filmSalonDto.getStartDate()) && incomingDTO.getStartDate().before(filmSalonDto.getEndDate()))
                    || (incomingDTO.getEndDate().after(filmSalonDto.getStartDate()) && incomingDTO.getEndDate().before(filmSalonDto.getEndDate()))){
                throw new IllegalArgumentException("bu saat aralığında film var!");
            }
        }
        return filmSalonMapper.toFilmSalonDto(filmSalonRepository.save(filmSalonMapper.toFilmSalon(filmSalonDto)));
    }



    @Override
    public List<FilmSalonDto> findAll() {
        return filmSalonMapper.toFilmSalonDtoList(filmSalonRepository.findAll());
    }

    @Override
    public FilmSalonDto findById(int id) {
        return filmSalonMapper.toFilmSalonDto(filmSalonRepository.findById(id));
    }

    @Override
    public List<FilmSalonDto> findAllBySalon_Id(int salonId) {
        return filmSalonMapper.toFilmSalonDtoList(filmSalonRepository.findAllBySalon_Id(salonId));
    }
}
