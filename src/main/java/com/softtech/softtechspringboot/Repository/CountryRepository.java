package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
