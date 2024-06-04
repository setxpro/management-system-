package br.com.setxpro.auth_user.domain.core.usecases.supplier;
import br.com.setxpro.auth_user.domain.core.gateways.SupplierGateway;

import java.util.UUID;

public class DeleteOneUseCaseImpl implements DeleteOneUseCase {

    private final SupplierGateway supplierGateway;

    public DeleteOneUseCaseImpl(SupplierGateway supplierGateway) {
        this.supplierGateway = supplierGateway;
    }

    @Override
    public void execute(UUID id) {
        supplierGateway.deleteOne(id);
    }
}
