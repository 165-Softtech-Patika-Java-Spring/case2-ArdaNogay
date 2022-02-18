package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<Street,Integer> {
}
