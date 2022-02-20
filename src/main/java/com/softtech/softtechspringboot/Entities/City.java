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
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "city_name", nullable = false,unique = true)
    private String cityName;

    @Column(name = "city_plate", nullable = false,unique = true)
    private String cityPlate;

    @Column(name = "id_country")
    private int countryId;

}
