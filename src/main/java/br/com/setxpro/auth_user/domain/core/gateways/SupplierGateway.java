package br.com.setxpro.auth_user.domain.core.gateways;

import br.com.setxpro.auth_user.domain.core.entities.Supplier;
import br.com.setxpro.auth_user.domain.dtos.SupplierDto;

import java.util.List;
import java.util.UUID;

public interface SupplierGateway {
    Supplier create(SupplierDto supplierDto);
    List<Supplier> findAll();
    Supplier findOne(UUID id);
    Supplier updateOne(UUID id, SupplierDto supplierDto);
    void deleteOne(UUID id);
}
