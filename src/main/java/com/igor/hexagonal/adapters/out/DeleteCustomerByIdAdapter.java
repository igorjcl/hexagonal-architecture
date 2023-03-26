package com.igor.hexagonal.adapters.out;

import com.igor.hexagonal.adapters.out.repository.CustomerRepository;
import com.igor.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    private final CustomerRepository customerRepository;

    @Override
    public void delete(final Long id) {
        customerRepository.deleteById(id);
    }
}
