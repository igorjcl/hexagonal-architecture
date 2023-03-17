package com.igor.hexagonal.application.core.usecase;

import com.igor.hexagonal.application.core.domain.Address;
import com.igor.hexagonal.application.core.domain.Customer;
import com.igor.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.igor.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class InsertCustomerUseCaseTest {

    @InjectMocks
    private InsertCustomerUseCase insertCustomerUseCase;

    @Mock
    private FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    @Mock
    private InsertCustomerOutputPort insertCustomerOutputPort;

    @Test
    void shouldInsertCustomer() {
        final Customer customer = createCustomer(1L);
        final String zipCode = "59141765";

        insertCustomerUseCase.insert(customer, zipCode);

        verify(findAddressByZipCodeOutputPort, times(1)).find(zipCode);
        verify(insertCustomerOutputPort, times(1)).insert(any());
    }

    private Customer createCustomer(final Long id) {
        final var customer = new Customer();
        customer.setId(id);
        customer.setName("Name");
        customer.setCpf("0990223221");

        final var address = new Address();
        address.setCity("city");
        address.setState("state");
        address.setStreet("street");
        customer.setAddress(address);
        return customer;
    }

}
