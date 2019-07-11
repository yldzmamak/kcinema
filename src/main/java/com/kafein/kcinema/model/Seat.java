package com.kafein.kcinema.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatName;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Salon salon;
}
