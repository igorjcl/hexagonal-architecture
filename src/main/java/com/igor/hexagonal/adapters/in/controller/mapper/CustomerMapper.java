package com.igor.hexagonal.adapters.in.controller.mapper;

import com.igor.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.igor.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(final CustomerRequest customerRequest);
}
