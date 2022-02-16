package com.softtech.softtechspringboot.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "neighborhoods")
public class Neighborhood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "neighborhood_id")
    private int id;

    @Column(name = "neighborhood_name")
    private String neighborhoodName;

    @OneToMany(mappedBy = "neighborhood")
    List<District> districts;

    @ManyToOne()
    @JoinColumn(name = "street_id")
    private Street street;


}
