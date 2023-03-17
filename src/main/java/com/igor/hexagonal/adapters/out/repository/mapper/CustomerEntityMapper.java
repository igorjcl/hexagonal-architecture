package com.igor.hexagonal.adapters.out.repository.mapper;

import com.igor.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.igor.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(final Customer customer);
}
