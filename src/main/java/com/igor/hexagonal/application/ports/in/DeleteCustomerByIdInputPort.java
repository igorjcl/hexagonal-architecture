package com.igor.hexagonal.application.ports.in;

public interface DeleteCustomerByIdInputPort {

    void delete(final Long id);
}
