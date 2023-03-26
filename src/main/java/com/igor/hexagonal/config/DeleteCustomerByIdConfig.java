package com.igor.hexagonal.config;

import com.igor.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.igor.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.igor.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            final FindCustomerByIdUseCase findCustomerByIdUseCase,
            final DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
