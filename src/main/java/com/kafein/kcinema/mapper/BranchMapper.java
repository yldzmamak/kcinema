package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.BranchDto;
import com.kafein.kcinema.model.Branch;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DistrictMapper.class,CompanyMapper.class})
public interface BranchMapper {

    @Named("toBranch")
    Branch toBranch(BranchDto branchDto);

    @Named("toBranchDto")
    BranchDto toBranchDto(Branch branch);

    @IterableMapping(qualifiedByName = "toBranch")
    List<Branch> toBranchList(List<BranchDto> branchDtoList);

    @IterableMapping(qualifiedByName = "toBranchDto")
    List<BranchDto> toBranchDtoList(List<Branch> branchList);

}
