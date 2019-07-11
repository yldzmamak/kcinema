package com.kafein.kcinema.mapper;

import com.kafein.kcinema.dto.RoleDto;
import com.kafein.kcinema.model.Role;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Named("toRole")
    Role toRole(RoleDto roleDto);

    @Named("toRoleDto")
    RoleDto toRoleDto(Role role);

    @IterableMapping(qualifiedByName = "toRole")
    List<Role> toRoleList(List<RoleDto> roleDtoList);

    @IterableMapping(qualifiedByName = "toRoleDto")
    List<RoleDto> toRoleDtoList(List<Role> roleList);
}
