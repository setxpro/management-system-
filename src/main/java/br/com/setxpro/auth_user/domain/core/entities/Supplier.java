package br.com.setxpro.auth_user.domain.core.entities;

import java.util.UUID;

public class Supplier {
    private UUID id;
    private String name;
    private Address address;
    private String phone;
    private String email;
    private String taxId; // Identificação fiscal do fornecedor (CNPJ)
    private String cpf;
    private String website;
    private Boolean active;

    public Supplier(UUID id, String name, Address address, String phone, String email, String taxId, String cpf, String website, Boolean active) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.taxId = taxId;
        this.cpf = cpf;
        this.website = website;
        this.active = active;
    }

    public Supplier() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
