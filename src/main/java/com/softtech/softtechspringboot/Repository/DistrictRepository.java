package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District,Integer> {
}
