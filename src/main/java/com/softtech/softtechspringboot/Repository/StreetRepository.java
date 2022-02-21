package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StreetRepository extends JpaRepository<Street,Integer> {

    Optional<List<Street>> findAllByNeighborhoodId(Integer neighborhoodId);

}
