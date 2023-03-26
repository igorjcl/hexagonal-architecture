package com.igor.hexagonal.application.ports.out;

import com.igor.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(final Customer customer);
}
