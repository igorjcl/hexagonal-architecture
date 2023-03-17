package com.igor.hexagonal.adapters.out.client.mapper;

import com.igor.hexagonal.adapters.out.client.response.AddressResponse;
import com.igor.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(final AddressResponse addressResponse);
}
