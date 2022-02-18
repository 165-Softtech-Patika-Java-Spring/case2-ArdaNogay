package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends JpaRepository<Street,Integer> {
}
