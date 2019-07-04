package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.BranchDto;
import com.kafein.kcinema.model.Branch;
import com.kafein.kcinema.repository.BranchRepository;
import com.kafein.kcinema.service.base.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branches")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @ResponseBody
    @GetMapping
    public List<BranchDto> findAll(){
        List<BranchDto> branchDtoList = branchService.findAll();
        if(branchDtoList.size()==0){
            throw new IllegalArgumentException("Herhangi bir şube kayıtlı değil.");
        }
        return branchDtoList;
    }

    @ResponseBody
    @GetMapping("findById")
    public BranchDto findById(@RequestParam("id") int id){
        BranchDto branchDto = branchService.findById(id);
        if(branchDto== null){
            throw new IllegalArgumentException("Şube bulunamadı.");
        }
        return branchDto;
    }

    @ResponseBody
    @PostMapping
    public BranchDto save(@RequestBody BranchDto branchDto){
        return branchService.save(branchDto);
    }

}
