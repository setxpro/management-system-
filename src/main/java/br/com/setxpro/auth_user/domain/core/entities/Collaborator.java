package br.com.setxpro.auth_user.domain.core.entities;

import br.com.setxpro.auth_user.domain.enums.RoleEnum;

import java.time.LocalDateTime;
import java.util.UUID;

public class Collaborator {
    private UUID id;
    private String name;
    private String socialName;
    private String lastName;
    private LocalDateTime birthDay;
    private String gender;
    private Access access;
    private RoleEnum role;
    private String cpfCnpj;
    private String register; // matricula
    private String email;
    private String phone;
    private String phone2;
    private Address address;
    private Boolean active;

    public Collaborator(UUID id, String name, String socialName, String lastName, LocalDateTime birthDay, String gender, Access access, RoleEnum role, String cpfCnpj, String register, String email, String phone, String phone2, Address address, Boolean active) {
        this.id = id;
        this.name = name;
        this.socialName = socialName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.access = access;
        this.role = role;
        this.cpfCnpj = cpfCnpj;
        this.register = register;
        this.email = email;
        this.phone = phone;
        this.phone2 = phone2;
        this.address = address;
        this.active = active;
    }

    public Collaborator() {
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

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
