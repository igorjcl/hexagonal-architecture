package com.igor.hexagonal.application.ports.out;

import com.igor.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(final Long id);
}
