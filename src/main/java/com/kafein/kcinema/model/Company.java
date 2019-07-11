package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String companyName;

    @OneToMany(mappedBy = "company", cascade = CascadeType.REMOVE,fetch = FetchType.LAZY,orphanRemoval = true)
    private Set<Branch> branchSet;

}
