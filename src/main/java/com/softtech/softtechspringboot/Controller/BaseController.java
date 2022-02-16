package com.softtech.softtechspringboot.Controller;

import com.softtech.softtechspringboot.Entities.Country;
import com.softtech.softtechspringboot.Service.CountryManager;
import com.softtech.softtechspringboot.Service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class BaseController {

    private CountryManager countryManager;


    @PostMapping("/addCountry")
    public ResponseEntity saveCountry(@RequestBody Country country){
        countryManager.add(country);
        return ResponseEntity.ok(country);
    }

}
