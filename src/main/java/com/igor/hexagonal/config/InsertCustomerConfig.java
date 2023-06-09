package com.igor.hexagonal.config;

import com.igor.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.igor.hexagonal.adapters.out.InsertCustomerAdapter;
import com.igor.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            final FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            final InsertCustomerAdapter insertCustomerAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);
    }
}
