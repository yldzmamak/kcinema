package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cityName;

    @OneToMany(mappedBy = "city", cascade = CascadeType.REMOVE)
    private List<District> districts;


}
