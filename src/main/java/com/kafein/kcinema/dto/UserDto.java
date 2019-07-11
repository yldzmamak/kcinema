package com.kafein.kcinema.dto;

import java.util.Date;
import java.util.Set;

import com.kafein.kcinema.model.Role;
import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String name;
    private String surname;
    private String telNo;
    private Date birthday;
    private String eMail;
    private Set<RoleDto> role;
    private String userName;
    private String password;
}
