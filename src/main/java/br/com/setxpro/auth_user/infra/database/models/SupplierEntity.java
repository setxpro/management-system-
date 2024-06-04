package br.com.setxpro.auth_user.infra.database.models;

import br.com.setxpro.auth_user.domain.dtos.SupplierDto;
import br.com.setxpro.auth_user.infra.mappers.AddressMapper;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Entity
@Table(name = "supplier")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class SupplierEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AddressEntity address;

    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "taxId")
    private String taxId; // Identificação fiscal do fornecedor (CNPJ)
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "website")
    private String website;
    @Column(name = "active")
    private Boolean active;

    public SupplierEntity(SupplierDto supplierDto) {
        this.id = supplierDto.id();
        this.name= supplierDto.name();
        this.phone = supplierDto.phone();
        this.email = supplierDto.email();
        this.taxId = supplierDto.taxId();
        this.cpf = supplierDto.cpf();
        this.website = supplierDto.website();
        this.active = supplierDto.active();
    }

    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID();
        }
    }

}
