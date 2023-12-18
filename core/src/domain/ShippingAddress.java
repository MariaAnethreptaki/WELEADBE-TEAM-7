package core.src.domain;

import core.src.domain.enumPackage.TypeAddress;

/**
 * this class includes attributes of a shipping address.
 */
public class ShippingAddress {
    private String street;
    private String streetNumber;
    private String floor;
    private String bell;

    private String city;
    private String zipCode;
    private String specificInstructions;
    private TypeAddress typeAddress;
    private String communicationPhoneNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getBell() {
        return bell;
    }

    public void setBell(String bell) {
        this.bell = bell;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSpecificInstructions() {
        return specificInstructions;
    }

    public void setSpecificInstructions(String specificInstructions) {
        this.specificInstructions = specificInstructions;
    }

    public TypeAddress getTypeAddress() {
        return typeAddress;
    }

    public void setTypeAddress(TypeAddress typeAddress) {
        this.typeAddress = typeAddress;
    }

    public String getCommunicationPhoneNumber() {
        return communicationPhoneNumber;
    }

    public void setCommunicationPhoneNumber(String communicationPhoneNumber) {
        this.communicationPhoneNumber = communicationPhoneNumber;
    }

    public ShippingAddress(String street, String streetNumber, String floor, String bell, String city, String zipCode, String specificInstructions, TypeAddress typeAddress, String communicationPhoneNumber) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.floor = floor;
        this.bell = bell;
        this.city = city;
        this.zipCode = zipCode;
        this.specificInstructions = specificInstructions;
        this.typeAddress = typeAddress;
        this.communicationPhoneNumber = communicationPhoneNumber;
    }

    public ShippingAddress(String street, String streetNumber, String city, String zipCode, String communicationPhoneNumber) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.zipCode = zipCode;
        this.communicationPhoneNumber = communicationPhoneNumber;
    }
}
