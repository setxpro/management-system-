package br.com.setxpro.auth_user.infra.mappers;

import br.com.setxpro.auth_user.domain.core.entities.Customer;
import br.com.setxpro.auth_user.infra.database.models.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    private final AddressMapper addressMapper;
    private final AccessMapper accessMapper;

    public CustomerMapper(AddressMapper addressMapper, AccessMapper accessMapper) {
        this.addressMapper = addressMapper;
        this.accessMapper = accessMapper;
    }

    public CustomerEntity toCustomerEntity(Customer customer) {

        if (customer == null) {
            return null;
        }

        return new CustomerEntity(
                customer.getId(),
                customer.getFullName(),
                customer.getEmail(),
                accessMapper.toAccessEntity(customer.getAccess()),
                customer.getPhone(),
                customer.getPhone2(),
                customer.getCpfCnpj(),
                addressMapper.toAddressEntity(customer.getAddress()),
                customer.getActive()
        );
    }

    public Customer toCustomerDomainEntity(CustomerEntity customerEntity) {

        if (customerEntity == null) {
            return null;
        }

        return new Customer(
                customerEntity.getId(),
                customerEntity.getFullName(),
                customerEntity.getEmail(),
                accessMapper.toAccessDomainEntity(customerEntity.getAccess()),
                customerEntity.getPhone(),
                customerEntity.getPhone2(),
                customerEntity.getCpfCnpj(),
                addressMapper.toAddressDomainEntity(customerEntity.getAddress()),
                customerEntity.getActive()
        );
    }
}
