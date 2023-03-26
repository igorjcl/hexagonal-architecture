package com.igor.hexagonal.adapters.out;

import com.igor.hexagonal.adapters.out.repository.CustomerRepository;
import com.igor.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.igor.hexagonal.application.core.domain.Customer;
import com.igor.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
