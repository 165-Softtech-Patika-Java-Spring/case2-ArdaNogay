package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.District;
import com.softtech.softtechspringboot.Entities.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NeighborhoodRepository extends JpaRepository<Neighborhood,Integer> {
    Optional<List<Neighborhood>> findAllByDistrictId(Integer districtId);
}
