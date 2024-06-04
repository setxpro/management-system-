package br.com.setxpro.auth_user.domain.dtos;

import br.com.setxpro.auth_user.domain.core.entities.Access;
import br.com.setxpro.auth_user.domain.core.entities.Address;

import java.util.UUID;

public record CustomerDto(
        UUID id,
        String fullName,
        String email,
        Access access,
        String phone,
        String phone2,
        String cpfCnpj,
        Address address,
        Boolean active
) {
}
