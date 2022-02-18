package com.softtech.softtechspringboot.Controller;

import com.softtech.softtechspringboot.Entities.Country;
import com.softtech.softtechspringboot.Service.EntitiyService.CountryManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BaseController {

//    private final CountryDto countryDto;
    private final CountryManager countryManager;

    @PostMapping("/addCountry")
    public ResponseEntity saveCountry(@RequestBody Country country){
        countryManager.save(country);
        return ResponseEntity.ok(country);
    }

//    @GetMapping
//    public ResponseEntity findAll(){
//
//        List<CountryDto> countryDtoList = countryManager.findAll();
//        return new ResponseEntity(countryDtoList, HttpStatus.OK);
//    }

}
