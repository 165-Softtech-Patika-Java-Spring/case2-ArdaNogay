package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DistrictRepository extends JpaRepository<District,Integer> {

    Optional<List<District>> findAllByCityId(Integer cityId);
}
