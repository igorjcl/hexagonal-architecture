package com.igor.hexagonal.application.ports.in;

import com.igor.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(final Customer customer, final String zipCode);
}
