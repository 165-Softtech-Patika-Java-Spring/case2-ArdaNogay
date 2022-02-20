package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

}
