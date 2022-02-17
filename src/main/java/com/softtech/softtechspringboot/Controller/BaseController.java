package com.softtech.softtechspringboot.Controller;

import com.softtech.softtechspringboot.Entities.Country;
import com.softtech.softtechspringboot.Service.CountryManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BaseController {

    private final CountryManager countryManager;

    @PostMapping("/addCountry")
    public ResponseEntity saveCountry(@RequestBody Country country){
        countryManager.add(country);
        return ResponseEntity.ok(country);
    }

}
