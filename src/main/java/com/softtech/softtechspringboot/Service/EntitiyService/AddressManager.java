package com.softtech.softtechspringboot.Service.EntitiyService;

import com.softtech.softtechspringboot.Converter.AddressMapper;
import com.softtech.softtechspringboot.Dto.AddressDto;
import com.softtech.softtechspringboot.Dto.AddressQueryDto;
import com.softtech.softtechspringboot.Dto.AddressResponseDto;
import com.softtech.softtechspringboot.Dto.AddressSaveDto;
import com.softtech.softtechspringboot.Entities.Address;
import com.softtech.softtechspringboot.Repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class AddressManager {

    private final AddressRepository addressRepository;
    private final CountryRepository countryRepository;
    private final CityRepository cityRepository;
    private final DistrictRepository districtRepository;
    private final NeighborhoodRepository neighborhoodRepository;
    private final StreetRepository streetRepository;

    public AddressDto save(AddressSaveDto addressSaveDto){
//        if (!countryRepository.existsById(addressSaveDto.getCountryId())){
//            throw new EntityNotFoundException("The country you entered could not be found!");
//        }
//        if (!cityRepository.existsCityByIdAndCountryId(addressSaveDto.getCityId(),addressSaveDto.getCountryId())){
//            throw new EntityNotFoundException("The city for the country ID you entered could not be found!");
//        }
//        if(!districtRepository.existsDistrictByIdAndCityId(addressSaveDto.getDistrictId(),addressSaveDto.getCityId())){
//            throw new EntityNotFoundException("The neighborhood for the city ID you entered could not be found!");
//        }
//        if (!neighborhoodRepository.existsNeighborhoodByIdAndDistrictId(addressSaveDto.getNeighborhoodId(),addressSaveDto.getDistrictId())){
//            throw new EntityNotFoundException("The district for the neighborhood ID you entered could not be found!");
//        }
//        if(!streetRepository.existsStreetByIdAndNeighborhoodId(addressSaveDto.getStreetId(),addressSaveDto.getNeighborhoodId())){
//            throw new EntityNotFoundException("The street for the district ID you entered could not be found!");
//        }
        Address address = AddressMapper.INSTANCE.convertToAddress(addressSaveDto);
        address = addressRepository.save(address);
        AddressDto addressDto = AddressMapper.INSTANCE.convertToAddressDto(address);
        return addressDto;
    }

    public AddressQueryDto findById(int addressId){
        Address address = addressRepository.getById(addressId);
        AddressQueryDto addressQueryDto = addressRepository.findAddressByIdWithNames(address.getId());
        return addressQueryDto;
    }

    public void deleteById(int addressId){
        Address address = addressRepository.getById(addressId);
        addressRepository.delete(address);
    }

}
