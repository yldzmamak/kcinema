package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;


}
