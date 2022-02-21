package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

    Optional<Address> findAddressById(int addressId);
}
