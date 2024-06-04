package br.com.setxpro.auth_user.domain.core.usecases.supplier;
import br.com.setxpro.auth_user.domain.core.entities.Supplier;
import br.com.setxpro.auth_user.domain.core.gateways.SupplierGateway;

import java.util.List;

public class FindAllSupplierUseCaseImpl implements FindAllSupplierUseCase {

    private final SupplierGateway supplierGateway;

    public FindAllSupplierUseCaseImpl(SupplierGateway supplierGateway) {
        this.supplierGateway = supplierGateway;
    }

    @Override
    public List<Supplier> execute() {
        return supplierGateway.findAll();
    }
}
