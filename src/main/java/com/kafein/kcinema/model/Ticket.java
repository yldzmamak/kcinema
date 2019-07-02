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

    @ManyToOne
    private Fee fee;

    @ManyToOne
    private Seat seat;

    @ManyToOne
    private FilmSalon filmSalon;
}
