package com.softtech.softtechspringboot.Service.EntitiyService;

import com.softtech.softtechspringboot.Entities.City;
import com.softtech.softtechspringboot.Entities.District;
import com.softtech.softtechspringboot.Repository.DistrictRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DistrictManager {

    private final DistrictRepository districtRepository;

    public District save(District district){
        return districtRepository.save(district);
    }

//    public List<District> findDistrictOfTheCity(int cityId){
//        return
//    }
}
