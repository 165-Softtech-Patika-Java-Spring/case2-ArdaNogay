package com.softtech.softtechspringboot.Service.EntitiyService;

import com.softtech.softtechspringboot.Entities.District;
import com.softtech.softtechspringboot.Repository.DistrictRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DistrictManager {

    private final DistrictRepository districtRepository;

    public District save(District district){
        return districtRepository.save(district);
    }

    public Optional<List<District>> findDistrictsOfTheCityById(int cityId){
        return districtRepository.findAllByCityId(cityId);
    }
}
