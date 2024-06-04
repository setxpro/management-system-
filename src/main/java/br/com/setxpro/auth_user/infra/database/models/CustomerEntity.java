package br.com.setxpro.auth_user.infra.database.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.UUID;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CustomerEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "access_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AccessEntity access;

    @Column(name = "phone")
    private String phone;
    @Column(name = "phone2")
    private String phone2;
    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AddressEntity address;

    @Column(name = "active")
    private Boolean active;

    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID();
        }
    }
}
