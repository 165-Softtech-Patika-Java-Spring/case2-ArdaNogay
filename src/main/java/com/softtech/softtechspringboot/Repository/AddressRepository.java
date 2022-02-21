package com.softtech.softtechspringboot.Repository;

import com.softtech.softtechspringboot.Dto.AddressQueryDto;
import com.softtech.softtechspringboot.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

    Optional<Address> findAddressById(int addressId);

    @Query(value = "SELECT  country.name as countryName,"
            + "city.name as cityName,"
            + "district.name as districtName,"
            + "street.name as streetName,"
            + "address.building_no as buildingNumber,"
            + "address.door_no as doorNumber"
            + "FROM Address address"
            + "LEFT OUTER JOIN Country country ON (country.id = address.id_country)"
            + "LEFT OUTER JOIN City city ON (city.id = address.id_city)"
            + "LEFT OUTER JOIN District district ON (district.id = address.id_district)"
            + "LEFT OUTER JOIN Neighborhood neighborhood ON (neighborhood.id = address.id_neighborhood)"
            + "LEFT OUTER JOIN Street street ON (street.id = address.id_street)"
            + "WHRE addreess.id = :id", nativeQuery = true)
    AddressQueryDto findAddressByIdWithNames(@Param("id") int id);


}
