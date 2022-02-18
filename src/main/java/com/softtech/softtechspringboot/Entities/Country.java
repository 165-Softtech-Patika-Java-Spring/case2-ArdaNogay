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
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "country_code")
    private String countryCode;

    @JsonIgnore
    @OneToMany(mappedBy = "country")
    private List<City> cities;

    @JsonIgnore
    @OneToMany(mappedBy = "country")
    private List<Address> addresses;

}
