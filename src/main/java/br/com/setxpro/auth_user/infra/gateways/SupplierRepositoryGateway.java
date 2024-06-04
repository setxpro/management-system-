package br.com.setxpro.auth_user.infra.gateways;
import br.com.setxpro.auth_user.domain.core.entities.Supplier;
import br.com.setxpro.auth_user.domain.core.gateways.SupplierGateway;
import br.com.setxpro.auth_user.domain.dtos.SupplierDto;
import br.com.setxpro.auth_user.domain.utils.MethodUtils;
import br.com.setxpro.auth_user.infra.database.models.SupplierEntity;
import br.com.setxpro.auth_user.infra.database.repositories.SupplierRepository;
import br.com.setxpro.auth_user.infra.mappers.SupplierMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class SupplierRepositoryGateway implements SupplierGateway {

    private final SupplierRepository supplierRepository;
    private final SupplierMapper supplierMapper;
    private final MethodUtils methodUtils;

    public SupplierRepositoryGateway(SupplierRepository supplierRepository, SupplierMapper supplierMapper, MethodUtils methodUtils) {
        this.supplierRepository = supplierRepository;
        this.supplierMapper = supplierMapper;
        this.methodUtils = methodUtils;
    }

    @Override
    public Supplier create(SupplierDto supplierDto) {

        Optional<SupplierEntity> verifyIfTaxSupplierExists = supplierRepository.findByTaxId(supplierDto.taxId());
        Optional<SupplierEntity> verifyIfCpfSupplierExists = supplierRepository.findByCpf(supplierDto.cpf());

        if (verifyIfCpfSupplierExists.isPresent()) {
//            throw new Exception("");
        }
        if (verifyIfTaxSupplierExists.isPresent()) {
//            throw new Exception("");
        }

        SupplierEntity supplier = new SupplierEntity(supplierDto);

        return supplierMapper.toSupplierDomainEntity(
                supplierRepository.save(
                        supplier
                )
        );
    }

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll().stream().map(supplierMapper::toSupplierDomainEntity).collect(Collectors.toList());
    }

    @Override
    public Supplier findOne(UUID id) {
        Optional<SupplierEntity> shipping = supplierRepository.findById(id);
        if (shipping.isEmpty()) {
          //  throw new Exception(id);
        }
        return supplierMapper.toSupplierDomainEntity(shipping.get());
    }

    @Override
    public Supplier updateOne(UUID id, SupplierDto supplierDto) {
        Supplier getSupplier = findOne(id);

        if (getSupplier != null) {
            methodUtils.copyNonNullProperties(supplierDto, getSupplier);

            return supplierMapper.toSupplierDomainEntity(
                    supplierRepository.save(
                            supplierMapper.toSupplierEntity(
                                    getSupplier
                            )
                    )
            );
        }
     //   throw new Exceptions(id);
        return null;
    }

    @Override
    public void deleteOne(UUID id) {
        Supplier getSupplier = findOne(id);
        if (getSupplier != null) {
            supplierRepository.deleteById(id);
        }
        // throw new Exception("");
    }
}
