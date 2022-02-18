package com.softtech.softtechspringboot.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "streets")
public class Street {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "street_id")
    private int id;

    @Column(name = "street_name")
    private String streetName;

    @ManyToOne
    @JoinColumn(name = "neighborhood_id")
    private Neighborhood neighborhood;

    @JsonIgnore
    @OneToMany(mappedBy = "street")
    private List<Address> addresses;
}
