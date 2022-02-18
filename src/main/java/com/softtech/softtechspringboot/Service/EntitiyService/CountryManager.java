package com.softtech.softtechspringboot.Service.EntitiyService;

import com.softtech.softtechspringboot.Entities.Country;
import com.softtech.softtechspringboot.Repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryManager {

    private  final CountryRepository countryRepository;

//    public Country add(Country country) {
//        return countryRepository.save(country);
//    }

    public Optional<Country> findById(int id){
        return countryRepository.findById(id);
    }

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

}
