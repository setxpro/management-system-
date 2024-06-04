package br.com.setxpro.auth_user.domain.dtos;

import br.com.setxpro.auth_user.domain.core.entities.Access;
import br.com.setxpro.auth_user.domain.core.entities.Address;
import br.com.setxpro.auth_user.domain.enums.RoleEnum;

import java.time.LocalDateTime;
import java.util.UUID;

public record CollaboratorDto(
        UUID id,
        String name,
        String socialName,
        String lastName,
        LocalDateTime birthDay,
        String gender,
        Access access,
        RoleEnum role,
        String cpfCnpj,
        String register,
        String email,
        String phone,
        String phone2,
        Address address,
        Boolean active
) {
}
