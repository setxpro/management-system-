package br.com.setxpro.auth_user.domain.core.usecases.supplier;

import java.util.UUID;

public interface DeleteOneUseCase {
    void execute(UUID id);
}
