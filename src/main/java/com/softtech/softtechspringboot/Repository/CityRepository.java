package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
}
