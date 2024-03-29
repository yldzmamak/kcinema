package com.kafein.kcinema.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String districtName;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "district")
    private List<Branch> branches;

    @PreRemove
    public void preRemove(){
        for (Branch branch : branches) {
            branch.setDistrict(null);
        }
    }
}
