package com.softtech.softtechspringboot.Controller;

import com.softtech.softtechspringboot.Dto.CountryDto;
import com.softtech.softtechspringboot.Entities.Country;
import com.softtech.softtechspringboot.Service.ControllerService.CountryControllerManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BaseController {

    private final CountryControllerManager countryControllerManager;

    @PostMapping("/addCountry")
    public ResponseEntity saveCountry(@RequestBody Country country){
        countryControllerManager.add(country);
        return ResponseEntity.ok(country);
    }

    @GetMapping
    public ResponseEntity findAll(){

        List<CountryDto> countryDtoList = countryControllerManager.findAll();
        return new ResponseEntity(countryDtoList, HttpStatus.OK);
    }

}
