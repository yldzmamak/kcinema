package com.kafein.kcinema.service.base;

import com.kafein.kcinema.dto.BranchDto;

import java.util.List;

public interface BranchService {
    BranchDto save(BranchDto branchDto);

    List<BranchDto> findAll();

    BranchDto findById(Integer id);
}
