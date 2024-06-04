package br.com.setxpro.auth_user.domain.core.usecases.supplier;
import br.com.setxpro.auth_user.domain.core.entities.Supplier;
import br.com.setxpro.auth_user.domain.core.gateways.SupplierGateway;

import java.util.UUID;

public class FindOneSupplierUseCaseImpl implements FindOneSupplierUseCase {

    private final SupplierGateway supplierGateway;

    public FindOneSupplierUseCaseImpl(SupplierGateway supplierGateway) {
        this.supplierGateway = supplierGateway;
    }

    @Override
    public Supplier execute(UUID id) {
        return supplierGateway.findOne(id);
    }
}
