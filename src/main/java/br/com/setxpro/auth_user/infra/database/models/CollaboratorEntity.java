package br.com.setxpro.auth_user.infra.database.models;

import br.com.setxpro.auth_user.domain.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "collaborator")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CollaboratorEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "social_name")
    private String socialName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_day")
    private LocalDateTime birthDay;

    @Column(name = "gender")
    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "access_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AccessEntity access;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private RoleEnum role;

    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @Column(name = "register")
    private String register; // matricula

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "phone2")
    private String phone2;

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
