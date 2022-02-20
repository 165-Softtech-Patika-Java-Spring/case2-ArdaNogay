package com.softtech.softtechspringboot.Service.EntitiyService;

import com.softtech.softtechspringboot.Entities.Country;
import com.softtech.softtechspringboot.Repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryManager {//CountryEntityService

    //             CountryDao
    private  final CountryRepository countryRepository;

    public Country save(Country country) {
        return countryRepository.save(country);
    }

    public Country findByCountryCode(String countryCode){
        return countryRepository.findCountryByCountryCode(countryCode);
    }



}
