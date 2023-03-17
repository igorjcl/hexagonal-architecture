package com.igor.hexagonal.application.ports.out;

import com.igor.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(final Customer customer);
}
