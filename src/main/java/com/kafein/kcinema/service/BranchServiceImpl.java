package com.kafein.kcinema.service;

import com.kafein.kcinema.dto.BranchDto;
import com.kafein.kcinema.mapper.BranchMapper;
import com.kafein.kcinema.repository.BranchRepository;
import com.kafein.kcinema.service.base.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private BranchMapper branchMapper;

    @Override
    public BranchDto save(BranchDto branchDto) {
        return branchMapper.toBranchDto(branchRepository.save(branchMapper.toBranch(branchDto)));
    }

    @Override
    public List<BranchDto> findAll() {
        return branchMapper.toBranchDtoList(branchRepository.findAll());
    }

    @Override
    public BranchDto findById(int id) {
        return branchMapper.toBranchDto(branchRepository.findById(id));
    }
}
