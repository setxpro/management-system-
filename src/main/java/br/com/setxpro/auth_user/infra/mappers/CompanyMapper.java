package br.com.setxpro.auth_user.infra.mappers;

import br.com.setxpro.auth_user.domain.core.entities.Company;
import br.com.setxpro.auth_user.infra.database.models.CompanyEntity;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {
    private final AddressMapper addressMapper;

    public CompanyMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    public CompanyEntity toCompanyEntity(Company company) {

        if (company == null) {
            return null;
        }

        return new CompanyEntity(
                company.getId(),
                company.getFantasyName(),
                company.getCorporateName(),
                company.getSector(),
                addressMapper.toAddressEntity(company.getAddress()),
                company.getPhone(),
                company.getPhone2(),
                company.getEmail(),
                company.getWebsite(),
                company.getEmployees(),
                company.getRevenue(),
                company.getFoundedYear(),
                company.getCnpj(),
                company.getActive()
        );
    }

    public Company toCompanyDomainEntity(CompanyEntity companyEntity) {

        if (companyEntity == null) {
            return null;
        }

        return new Company(
                companyEntity.getId(),
                companyEntity.getFantasyName(),
                companyEntity.getCorporateName(),
                companyEntity.getSector(),
                addressMapper.toAddressDomainEntity(companyEntity.getAddress()),
                companyEntity.getPhone(),
                companyEntity.getPhone2(),
                companyEntity.getEmail(),
                companyEntity.getWebsite(),
                companyEntity.getEmployees(),
                companyEntity.getRevenue(),
                companyEntity.getFoundedYear(),
                companyEntity.getCnpj(),
                companyEntity.getActive()
        );
    }
}
