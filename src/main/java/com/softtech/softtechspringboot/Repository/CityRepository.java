package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
    City findCityByCityPlate (String cityPlate);
}
