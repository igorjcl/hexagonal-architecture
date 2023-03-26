package com.igor.hexagonal.config;

import com.igor.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.igor.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.igor.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.igor.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            final FindCustomerByIdUseCase findCustomerByIdUseCase,
            final FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            final UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
