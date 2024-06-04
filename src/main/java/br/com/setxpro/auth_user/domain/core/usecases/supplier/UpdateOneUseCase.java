package br.com.setxpro.auth_user.domain.core.usecases.supplier;
import br.com.setxpro.auth_user.domain.core.entities.Supplier;
import br.com.setxpro.auth_user.domain.dtos.SupplierDto;

import java.util.UUID;

public interface UpdateOneUseCase {
    Supplier execute(UUID id, SupplierDto supplierDto);
}
