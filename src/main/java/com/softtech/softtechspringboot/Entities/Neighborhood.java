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

    @ManyToOne()
    @JoinColumn(name = "district_id")
    private District district;

    @OneToMany(mappedBy = "neighborhood")
    private List<Street> streets;


}
