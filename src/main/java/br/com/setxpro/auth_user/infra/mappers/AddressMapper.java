package br.com.setxpro.auth_user.infra.mappers;

import br.com.setxpro.auth_user.domain.core.entities.Address;
import br.com.setxpro.auth_user.infra.database.models.AddressEntity;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    public AddressEntity toAddressEntity(Address address) {
        if (address == null) {
            return null;
        }
        return new AddressEntity(
                address.getId(),
                address.getPostalCode(),
                address.getStreet(),
                address.getNumberAddress(),
                address.getComplement(),
                address.getNeighborhood(),
                address.getLocality(),
                address.getRegion(),
                address.getCountry(),
                address.getReference(),
                address.getAddressType()
        );
    }

    public Address toAddressDomainEntity(AddressEntity addressEntity) {

        if (addressEntity == null) {
            return null;
        }

        return new Address(
                addressEntity.getId(),
                addressEntity.getPostalCode(),
                addressEntity.getStreet(),
                addressEntity.getNumberAddress(),
                addressEntity.getComplement(),
                addressEntity.getNeighborhood(),
                addressEntity.getLocality(),
                addressEntity.getRegion(),
                addressEntity.getCountry(),
                addressEntity.getReference(),
                addressEntity.getAddressType()
        );
    }
}
