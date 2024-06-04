package br.com.setxpro.auth_user.domain.core.gateways;

import br.com.setxpro.auth_user.domain.core.entities.Customer;
import br.com.setxpro.auth_user.domain.dtos.CustomerDto;

import java.util.List;
import java.util.UUID;

public interface CustomerGateway {
    Customer create(CustomerDto customerDto);
    List<Customer> findAll();
    Customer findOne(UUID id);
    Customer updateOne(UUID id, CustomerDto customerDto);
    void deleteOne(UUID id);
}
