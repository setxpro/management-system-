package br.com.setxpro.auth_user.infra.mappers;

import br.com.setxpro.auth_user.domain.core.entities.Supplier;
import br.com.setxpro.auth_user.infra.database.models.SupplierEntity;
import org.springframework.stereotype.Component;

@Component
public class SupplierMapper {
    private final AddressMapper addressMapper;

    public SupplierMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    public SupplierEntity toSupplierEntity(Supplier supplier) {

        if (supplier == null) {
            return null;
        }

        return new SupplierEntity(
                supplier.getId(),
                supplier.getName(),
                addressMapper.toAddressEntity(supplier.getAddress()),
                supplier.getPhone(),
                supplier.getEmail(),
                supplier.getTaxId(),
                supplier.getCpf(),
                supplier.getWebsite(),
                supplier.getActive()
        );
    }

    public Supplier toSupplierDomainEntity(SupplierEntity supplierEntity) {

        if (supplierEntity == null) {
            return null;
        }

        return new Supplier(
                supplierEntity.getId(),
                supplierEntity.getName(),
                addressMapper.toAddressDomainEntity(supplierEntity.getAddress()),
                supplierEntity.getPhone(),
                supplierEntity.getEmail(),
                supplierEntity.getTaxId(),
                supplierEntity.getCpf(),
                supplierEntity.getWebsite(),
                supplierEntity.getActive()
        );
    }
}
