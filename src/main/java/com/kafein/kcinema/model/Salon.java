package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Salon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String salonName;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Branch branch;
}
