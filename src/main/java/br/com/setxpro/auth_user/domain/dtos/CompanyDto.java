package br.com.setxpro.auth_user.domain.dtos;

import br.com.setxpro.auth_user.domain.core.entities.Address;

import java.util.UUID;

public record CompanyDto(
        UUID id,
        String fantasyName,
        String corporateName,
        String sector,
        Address address,
        String phone,
        String phone2,
        String email,
        String website,
        int employees,
        String revenue,
        int foundedYear,
        String cnpj,
        Boolean active
) {
}
