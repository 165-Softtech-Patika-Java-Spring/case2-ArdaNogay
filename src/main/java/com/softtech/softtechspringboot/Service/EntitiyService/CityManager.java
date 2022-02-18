package com.softtech.softtechspringboot.Service.EntitiyService;

import com.softtech.softtechspringboot.Entities.City;
import com.softtech.softtechspringboot.Repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityManager {

    private final CityRepository cityRepository;

    public City save(City city){
        return cityRepository.save(city);
    }
}
