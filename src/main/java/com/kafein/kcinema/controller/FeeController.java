package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.FeeDto;
import com.kafein.kcinema.mapper.FeeMapper;
import com.kafein.kcinema.model.Fee;
import com.kafein.kcinema.repository.CompanyRepository;
import com.kafein.kcinema.repository.UserTypeRepository;
import com.kafein.kcinema.service.base.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fees")
public class FeeController {

    @Autowired
    private FeeService feeService;

    @Autowired
    private FeeMapper feeMapper;

    @ResponseBody
    @GetMapping
    public List<FeeDto> findAll() {
        List<FeeDto> feeDtoList = feeService.findAll();
        if(feeDtoList.size() == 0){
            throw new IllegalArgumentException("Herhangi bir ücret kayıtlı değil.");
        }
        return feeDtoList;
    }

    @ResponseBody
    @PostMapping
    public FeeDto save(@RequestBody FeeDto feeDto) {
        return feeService.save(feeDto);
    }

    @ResponseBody
    @GetMapping("/findById")
    public FeeDto findById(@RequestParam("id") int id) {
        FeeDto feeDto = feeService.findById(id);
        if(feeDto == null){
            throw new IllegalArgumentException("Ücret bulunamadı.");
        }
        return feeDto;
    }
}
