package br.com.setxpro.auth_user.domain.core.gateways;
import br.com.setxpro.auth_user.domain.core.entities.Access;
import br.com.setxpro.auth_user.domain.dtos.LoginDto;

import java.util.UUID;

public interface AccessGateway {
    Access signIn(LoginDto loginDto);
    Access findOne(UUID id);
    Access updateOne(UUID id, Access access);
}
