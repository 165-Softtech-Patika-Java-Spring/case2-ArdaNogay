package com.softtech.softtechspringboot.Service;

import com.softtech.softtechspringboot.Entities.Country;
import com.softtech.softtechspringboot.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryManager {

    CountryRepository countryRepository;

    @Autowired
    public CountryManager(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country add(Country country) {

        return countryRepository.save(country);
    }

}
