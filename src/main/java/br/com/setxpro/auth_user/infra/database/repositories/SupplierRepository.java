package br.com.setxpro.auth_user.infra.database.repositories;

import br.com.setxpro.auth_user.infra.database.models.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SupplierRepository extends JpaRepository<SupplierEntity, UUID> {
    Optional<SupplierEntity> findByTaxId(String taxId);
    Optional<SupplierEntity> findByCpf(String cpf);
}
