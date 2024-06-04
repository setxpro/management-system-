package br.com.setxpro.auth_user.domain.core.entities;

import java.util.UUID;

public class Address {
    private UUID id;
    private String postalCode;
    private String street;
    private String numberAddress;
    private String complement;
    private String neighborhood;
    private String locality;
    private String region;
    private String country;
    private String reference;
    private String addressType;

    public Address(UUID id, String postalCode, String street, String numberAddress, String complement, String neighborhood, String locality, String region, String country, String reference, String addressType) {
        this.id = id;
        this.postalCode = postalCode;
        this.street = street;
        this.numberAddress = numberAddress;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.locality = locality;
        this.region = region;
        this.country = country;
        this.reference = reference;
        this.addressType = addressType;
    }

    public Address() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumberAddress() {
        return numberAddress;
    }

    public void setNumberAddress(String numberAddress) {
        this.numberAddress = numberAddress;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }
}
