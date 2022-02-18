package com.softtech.softtechspringboot.Service.EntitiyService;

import com.softtech.softtechspringboot.Entities.Street;
import com.softtech.softtechspringboot.Repository.StreetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StreetManager {

    private final StreetRepository streetRepository;

    public Street save(Street street){
        return streetRepository.save(street);
    }
}
