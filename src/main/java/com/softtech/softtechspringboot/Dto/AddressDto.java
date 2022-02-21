package com.softtech.softtechspringboot.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {

    private int id;
    private int countryId;
    private int cityId;
    private int districtId;
    private int neighborhoodId;
    private int streetId;
    private String buildingNumber;
    private String doorNumber;

}
