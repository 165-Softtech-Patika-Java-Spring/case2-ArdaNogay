package com.softtech.softtechspringboot.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDto {

    private String countryName;
    private String cityName;
    private String districtName;
    private String neighborhoodName;
    private String streetName;
    private String buildingNumber;
    private String doorNumber;
}
