package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NeighborhoodRepository extends JpaRepository<Neighborhood,Integer> {
}
