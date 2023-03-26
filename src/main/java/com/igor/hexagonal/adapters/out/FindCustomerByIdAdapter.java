package com.igor.hexagonal.adapters.out;

import com.igor.hexagonal.adapters.out.repository.FindCustomerByIdRepository;
import com.igor.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.igor.hexagonal.application.core.domain.Customer;
import com.igor.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    private final FindCustomerByIdRepository findCustomerByIdRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(final Long id) {
        final var customer = findCustomerByIdRepository.findById(id);
        return customer.map(customerEntityMapper::toCustomer);
    }
}
