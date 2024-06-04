package br.com.setxpro.auth_user.domain.core.usecases.supplier;
import br.com.setxpro.auth_user.domain.core.entities.Supplier;
import br.com.setxpro.auth_user.domain.core.gateways.SupplierGateway;
import br.com.setxpro.auth_user.domain.dtos.SupplierDto;

import java.util.UUID;

public class UpdateOneUseCaseImpl implements UpdateOneUseCase {

    private final SupplierGateway supplierGateway;

    public UpdateOneUseCaseImpl(SupplierGateway supplierGateway) {
        this.supplierGateway = supplierGateway;
    }

    @Override
    public Supplier execute(UUID id, SupplierDto supplierDto) {
        return supplierGateway.updateOne(id, supplierDto);
    }
}
