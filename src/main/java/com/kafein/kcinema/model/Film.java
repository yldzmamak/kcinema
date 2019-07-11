package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String filmName;
    private int duration;

    @ManyToOne
    private Category category;
}
