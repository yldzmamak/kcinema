package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Fee fee;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Seat seat;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private FilmSalon filmSalon;
}
