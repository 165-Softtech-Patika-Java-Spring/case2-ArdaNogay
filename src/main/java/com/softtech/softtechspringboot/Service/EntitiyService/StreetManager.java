package com.softtech.softtechspringboot.Service.EntitiyService;

import com.softtech.softtechspringboot.Entities.Street;
import com.softtech.softtechspringboot.Repository.StreetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreetManager {

    private final StreetRepository streetRepository;

    public Street save(Street street){
        return streetRepository.save(street);
    }

    public Street update(int id, String newStreetName){
        Street street = streetRepository.getById(id);
        street.setStreetName(newStreetName);
        return streetRepository.save(street);
    }

    public Optional<List<Street>> findStreetsOfTheNeighborhoodById (int neighborhoodId){
        return streetRepository.findAllByNeighborhoodId(neighborhoodId);
    }
}
