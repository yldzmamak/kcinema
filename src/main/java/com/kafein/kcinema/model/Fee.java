package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Fee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private float price;

    @ManyToOne
    private Company company;

    @ManyToOne
    private UserType userType;
}
