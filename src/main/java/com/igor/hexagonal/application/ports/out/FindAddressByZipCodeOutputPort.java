package com.igor.hexagonal.application.ports.out;

import com.igor.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(final String zipCode);
}
