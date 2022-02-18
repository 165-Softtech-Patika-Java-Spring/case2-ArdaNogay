package com.softtech.softtechspringboot.Service.ControllerService;

import com.softtech.softtechspringboot.Dto.CountryDto;
import com.softtech.softtechspringboot.Entities.Country;
import com.softtech.softtechspringboot.Service.EntitiyService.CountryManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryControllerManager {//CountryService

//               CountryEntityService
    public final CountryManager countryManager;

    public List<CountryDto> findAll() {
        List<Country> CountryList = countryManager.findAll();
        for (Country country : CountryList) {
            
        }
    }
}
