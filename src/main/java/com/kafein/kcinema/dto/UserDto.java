package com.kafein.kcinema.dto;

import java.util.Date;
import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String name;
    private String surname;
    private String telNo;
    private Date birthday;
    private String eMail;
}
