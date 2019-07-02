package com.kafein.kcinema.service.base;

import com.kafein.kcinema.model.Branch;

import java.util.List;

public interface BranchService {
    Branch save(Branch branch);

    List<Branch> findAll();
}
