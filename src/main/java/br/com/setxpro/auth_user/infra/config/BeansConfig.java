package br.com.setxpro.auth_user.infra.config;

import br.com.setxpro.auth_user.domain.core.gateways.SupplierGateway;
import br.com.setxpro.auth_user.domain.core.usecases.supplier.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    // Supplier
    @Bean
    public CreateSupplierUseCase createSupplierUseCase(SupplierGateway supplierGateway) {
        return new CreateSupplierUseCaseImpl(supplierGateway);
    }
    @Bean
    public FindAllSupplierUseCase findAllSupplierUseCase(SupplierGateway supplierGateway) {
        return new FindAllSupplierUseCaseImpl(supplierGateway);
    }
    @Bean
    public FindOneSupplierUseCase findOneSupplierUseCase(SupplierGateway supplierGateway) {
        return new FindOneSupplierUseCaseImpl(supplierGateway);
    }
    @Bean
    public UpdateOneUseCase updateOneUseCase(SupplierGateway supplierGateway) {
        return new UpdateOneUseCaseImpl(supplierGateway);
    }
    @Bean
    public DeleteOneUseCase deleteOneUseCase(SupplierGateway supplierGateway) {
        return new DeleteOneUseCaseImpl(supplierGateway);
    }
}
