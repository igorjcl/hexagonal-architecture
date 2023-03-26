package com.igor.hexagonal.adapters.in.controller.response;

import com.igor.hexagonal.adapters.out.client.response.AddressResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {

    private Long id;
    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
