package com.softtech.softtechspringboot.Converter;

import com.softtech.softtechspringboot.Dto.AddressDto;
import com.softtech.softtechspringboot.Dto.AddressQueryDto;
import com.softtech.softtechspringboot.Dto.AddressResponseDto;
import com.softtech.softtechspringboot.Dto.AddressSaveDto;
import com.softtech.softtechspringboot.Entities.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address convertToAddress(AddressDto addressDto);
    Address convertToAddress(AddressSaveDto addressSaveDto);
    AddressDto convertToAddressDto(Address address);

    AddressResponseDto convertAddressResponseDto(AddressQueryDto addressQueryDto);

}
