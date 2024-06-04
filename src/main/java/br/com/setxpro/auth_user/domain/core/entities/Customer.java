package br.com.setxpro.auth_user.domain.core.entities;

import java.util.UUID;

public class Customer {
    private UUID id;
    private String fullName;
    private String email;
    private Access access;
    private String phone;
    private String phone2;
    private String cpfCnpj;
    private Address address;
    private Boolean active;

    public Customer(UUID id, String fullName, String email, Access access, String phone, String phone2, String cpfCnpj, Address address, Boolean active) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.access = access;
        this.phone = phone;
        this.phone2 = phone2;
        this.cpfCnpj = cpfCnpj;
        this.address = address;
        this.active = active;
    }

    public Customer() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
