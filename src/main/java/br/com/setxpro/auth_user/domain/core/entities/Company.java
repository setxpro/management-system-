package br.com.setxpro.auth_user.domain.core.entities;

import java.util.UUID;

public class Company {
    private UUID id;
    private String fantasyName;
    private String corporateName;
    private String sector;
    private Address address;
    private String phone;
    private String phone2;
    private String email;
    private String website;
    private int employees;
    private String revenue;
    private int foundedYear;
    private String cnpj;
    private Boolean active;

    public Company(UUID id, String fantasyName, String corporateName, String sector, Address address, String phone, String phone2, String email, String website, int employees, String revenue, int foundedYear, String cnpj, Boolean active) {
        this.id = id;
        this.fantasyName = fantasyName;
        this.corporateName = corporateName;
        this.sector = sector;
        this.address = address;
        this.phone = phone;
        this.phone2 = phone2;
        this.email = email;
        this.website = website;
        this.employees = employees;
        this.revenue = revenue;
        this.foundedYear = foundedYear;
        this.cnpj = cnpj;
        this.active = active;
    }

    public Company() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
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

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
