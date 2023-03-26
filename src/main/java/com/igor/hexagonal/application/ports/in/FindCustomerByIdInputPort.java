package com.igor.hexagonal.application.ports.in;

import com.igor.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(final Long id);
}
