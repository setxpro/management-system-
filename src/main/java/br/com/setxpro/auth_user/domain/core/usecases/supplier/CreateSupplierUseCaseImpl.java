package br.com.setxpro.auth_user.domain.core.usecases.supplier;
import br.com.setxpro.auth_user.domain.core.entities.Supplier;
import br.com.setxpro.auth_user.domain.core.gateways.SupplierGateway;
import br.com.setxpro.auth_user.domain.dtos.SupplierDto;

public class CreateSupplierUseCaseImpl implements CreateSupplierUseCase {

    private final SupplierGateway supplierGateway;

    public CreateSupplierUseCaseImpl(SupplierGateway supplierGateway) {
        this.supplierGateway = supplierGateway;
    }

    @Override
    public Supplier execute(SupplierDto supplierDto) {
        return supplierGateway.create(supplierDto);
    }
}
