package br.com.setxpro.auth_user.domain.core.gateways;

import br.com.setxpro.auth_user.domain.core.entities.Company;
import br.com.setxpro.auth_user.domain.dtos.CompanyDto;

import java.util.List;
import java.util.UUID;

public interface CompanyGateway {
    Company create(CompanyDto companyDto);
    List<Company> findAll();
    Company findOne(UUID id);
    Company updateOne(UUID id, CompanyDto companyDto);
    void deleteOne(UUID id);
}
