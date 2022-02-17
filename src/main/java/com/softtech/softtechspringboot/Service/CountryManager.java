package com.softtech.softtechspringboot.Service;

import com.softtech.softtechspringboot.Entities.Country;
import com.softtech.softtechspringboot.Repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryManager {

    private  final CountryRepository countryRepository;

    public Country add(Country country) {

        return countryRepository.save(country);
    }

}
