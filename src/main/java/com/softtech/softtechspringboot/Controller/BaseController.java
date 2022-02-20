package com.softtech.softtechspringboot.Controller;

import com.softtech.softtechspringboot.Entities.*;
import com.softtech.softtechspringboot.Service.EntitiyService.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BaseController {

    private final CountryManager countryManager;//    private final CountryDto countryDto;
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

    @GetMapping("/getCountry")
    public ResponseEntity getCountryByCountryCode(@RequestParam String countryCode){
        Country country = countryManager.findByCountryCode(countryCode);
        return ResponseEntity.ok(country);
    }

    @GetMapping("/getCity")
    public ResponseEntity getCityByCityPlate(@RequestParam String cityPlate){
        City city = cityManager.findByCityPlate(cityPlate);
        return ResponseEntity.ok(city);
    }

    @GetMapping("/getDistrictsByCityId")
    public ResponseEntity getAllDistrictsByCityId(@RequestParam int cityId){
        Optional<List<District>> districts = districtManager.findDistrictsOfTheCityById(cityId);
        return ResponseEntity.ok(districts);
    }

    @GetMapping("/getNeighborhoodsByDistrictId")
    public ResponseEntity getAllNeighborhoodsByDistrictId(@RequestParam int districtId){
        Optional<List<Neighborhood>> neighborhoods = neighborhoodManager.findNeighborhoodsOfTheDistrictById(districtId);
        return ResponseEntity.ok(neighborhoods);
    }

    // TEST AMAÇLI YAZILDI
    @GetMapping("getNeighborhoods")
    public ResponseEntity getAllNeighborhoods(){
        List<Neighborhood> neighborhoods = neighborhoodManager.getAll();
        return ResponseEntity.ok(neighborhoods);
    }

    @PutMapping("/setNewNeighborhoodName/{NeighborhoodId}/{newNeighborhoodName}")
    public ResponseEntity setNeighborhoodName(@PathVariable int NeighborhoodId, @PathVariable String newNeighborhoodName){
        Neighborhood neighborhood = neighborhoodManager.update(NeighborhoodId, newNeighborhoodName);
        return ResponseEntity.ok(neighborhood);
    }
}
