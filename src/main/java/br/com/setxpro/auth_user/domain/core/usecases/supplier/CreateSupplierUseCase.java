package br.com.setxpro.auth_user.domain.core.usecases.supplier;
import br.com.setxpro.auth_user.domain.core.entities.Supplier;
import br.com.setxpro.auth_user.domain.dtos.SupplierDto;

public interface CreateSupplierUseCase {
    Supplier execute(SupplierDto supplierDto);
}
