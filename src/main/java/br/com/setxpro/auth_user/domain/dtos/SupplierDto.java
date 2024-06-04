package br.com.setxpro.auth_user.domain.dtos;

import br.com.setxpro.auth_user.domain.core.entities.Address;

import java.util.UUID;

public record SupplierDto(
        UUID id,
        String name,
        Address address,
        String phone,
        String email,
        String taxId,
        String cpf,
        String website,
        Boolean active
) {
}
