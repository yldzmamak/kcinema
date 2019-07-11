package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;
    private String password;
    private String name;
    private String surname;
    private String telNo;
    private Date birthday;
    private String eMail;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> role;
}
