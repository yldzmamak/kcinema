package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.CityDto;
import com.kafein.kcinema.mapper.CityMapper;
import com.kafein.kcinema.mapper.CityMapperImpl;
import com.kafein.kcinema.model.City;
import com.kafein.kcinema.repository.CityRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CityServiceTest {
    @InjectMocks
    private CityServiceImpl cityService;

    @Mock
    private CityRepository cityRepository;

    @Mock
    private CityMapper cityMapper;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindById(){
        when(cityMapper.toCityDto(cityRepository.findById(anyInt()))).thenReturn(createdCityDtoByid());
        Assert.assertEquals(1,cityService.findById(anyInt()).getId());
    }

    private CityDto createdCityDtoByid(){
        CityDto cityDto = new CityDto();
        cityDto.setId(1);
        return cityDto;
    }

    @Test
    public void testfindAll(){
        when(cityMapper.toCityDtoList(cityRepository.findAll())).thenReturn(createdCityDtoList());
        Assert.assertEquals(2,cityService.findAll().size());
    }

    private List<CityDto> createdCityDtoList(){
        List<CityDto> cityDtoList =new ArrayList<CityDto>();
        CityDto cityDto = new CityDto();
        cityDto.setId(1);
        cityDtoList.add(cityDto);
        cityDto.setId(2);
        cityDtoList.add(cityDto);
        return cityDtoList;
    }
}
