package com.igor.hexagonal.adapters.out.repository;

import com.igor.hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FindCustomerByIdRepository extends MongoRepository<CustomerEntity, Long> {
}
