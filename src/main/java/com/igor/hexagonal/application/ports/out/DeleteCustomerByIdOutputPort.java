package com.igor.hexagonal.application.ports.out;

public interface DeleteCustomerByIdOutputPort {

    void delete(final Long id);
}
