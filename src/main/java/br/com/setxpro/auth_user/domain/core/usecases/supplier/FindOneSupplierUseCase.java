package br.com.setxpro.auth_user.domain.core.usecases.supplier;
import br.com.setxpro.auth_user.domain.core.entities.Supplier;

import java.util.UUID;

public interface FindOneSupplierUseCase {
    Supplier execute(UUID id);
}
