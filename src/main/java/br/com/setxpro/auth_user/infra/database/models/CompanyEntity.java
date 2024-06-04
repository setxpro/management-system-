package br.com.setxpro.auth_user.infra.database.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.UUID;

@Entity
@Table(name = "company")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CompanyEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "fantasy_name")
    private String fantasyName;

    @Column(name = "corporate_name")
    private String corporateName;

    @Column(name = "sector")
    private String sector;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AddressEntity address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "phone2")
    private String phone2;

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;

    @Column(name = "employees")
    private int employees;

    @Column(name = "revenue")
    private String revenue;

    @Column(name = "founded_year")
    private int foundedYear;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "active")
    private Boolean active;

    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID();
        }
    }
}
