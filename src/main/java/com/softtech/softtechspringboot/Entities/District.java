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
@Table(name = "districts")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "district_id")
    private int id;

    @Column(name = "district_name")
    private String districtName;

    @OneToMany(mappedBy = "district")
    private List<Country> countries;

    @ManyToOne()
    @JoinColumn(name = "neighborhood_id")
    private  Neighborhood neighborhood;

}
