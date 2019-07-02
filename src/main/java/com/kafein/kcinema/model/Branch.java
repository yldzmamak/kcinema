package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String branchName;
    private String telNo;
    private String adress;

    @ManyToOne
    private District district;

    @ManyToOne
    private Company company;
}
