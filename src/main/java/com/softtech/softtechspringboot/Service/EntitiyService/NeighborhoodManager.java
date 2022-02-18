package com.softtech.softtechspringboot.Service.EntitiyService;

import com.softtech.softtechspringboot.Entities.Neighborhood;
import com.softtech.softtechspringboot.Repository.NeighborhoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NeighborhoodManager {

    private final NeighborhoodRepository neighborhoodRepository;

    public Neighborhood add(Neighborhood neighborhood){
        return  neighborhoodRepository.save(neighborhood);
    }

}
