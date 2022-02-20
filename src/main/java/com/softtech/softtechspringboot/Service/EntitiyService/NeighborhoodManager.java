package com.softtech.softtechspringboot.Service.EntitiyService;

import com.softtech.softtechspringboot.Entities.Neighborhood;
import com.softtech.softtechspringboot.Repository.NeighborhoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NeighborhoodManager {

    private final NeighborhoodRepository neighborhoodRepository;

    public Neighborhood save(Neighborhood neighborhood){
        return  neighborhoodRepository.save(neighborhood);
    }

    public Neighborhood update(int id, String newNeighborhoodName) {
        Neighborhood neighborhood = neighborhoodRepository.getById(id);
        neighborhood.setNeighborhoodName(newNeighborhoodName);
        return  neighborhoodRepository.save(neighborhood);
    }

    public List<Neighborhood> getAll(){
        return neighborhoodRepository.findAll();
    }


}
