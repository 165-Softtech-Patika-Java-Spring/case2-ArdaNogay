package com.softtech.softtechspringboot.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "building_no", nullable = false)
    private String buildingNumber;

    @Column(name = "door_no", nullable = false)
    private String doorNumber;

    @Column(name = "id_country",nullable = false)
    private int countryId;

    @Column(name = "id_city",nullable = false)
    private int cityId;

    @Column(name = "id_district",nullable = false)
    private int districtId;

    @Column(name = "id_neighborhood",nullable = false)
    private int neighborhoodId;

    @Column(name = "id_street",nullable = false)
    private int streetId;

}
