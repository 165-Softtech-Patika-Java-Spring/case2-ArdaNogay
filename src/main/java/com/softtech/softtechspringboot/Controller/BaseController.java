package com.softtech.softtechspringboot.Controller;

import com.softtech.softtechspringboot.Entities.*;
import com.softtech.softtechspringboot.Service.EntitiyService.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BaseController {

//    private final CountryDto countryDto;
    private final CountryManager countryManager;
    private final CityManager cityManager;
    private final DistrictManager districtManager;
    private final NeighborhoodManager neighborhoodManager;
    private final StreetManager streetManager;

    @PostMapping("/saveCountry")
    public ResponseEntity saveCountry(@RequestBody Country country){
        countryManager.save(country);
        return ResponseEntity.ok(country);
    }

    @PostMapping("/saveCity")
    public ResponseEntity saveCity(@RequestBody City city){
        cityManager.save(city);
        return ResponseEntity.ok(city);
    }

    @PostMapping("/saveDistrict")
    public ResponseEntity saveDistrict(@RequestBody District district){
        districtManager.save(district);
        return ResponseEntity.ok(district);
    }

    @PostMapping("/saveNeighborhood")
    public ResponseEntity saveDistrict(@RequestBody Neighborhood neighborhood){
        neighborhoodManager.save(neighborhood);
        return ResponseEntity.ok(neighborhood);
    }

    @PostMapping("/saveStreet")
    public ResponseEntity saveStreet(@RequestBody Street street){
        streetManager.save(street);
        return ResponseEntity.ok(street);
    }
}
