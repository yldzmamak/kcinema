package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class FilmSalon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date startDate;
    private Date endDate;

    @ManyToOne
    private Film film;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Salon salon;
}
