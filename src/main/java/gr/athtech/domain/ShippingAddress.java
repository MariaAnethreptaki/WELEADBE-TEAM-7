package gr.athtech.domain;

import lombok.Builder;
import lombok.Getter;
import gr.athtech.domain.enumPackage.TypeAddress;

/**
 * this class includes attributes of a shipping address.
 */
@Getter
@Builder
public class ShippingAddress extends BaseModel{
    private String street;
    private String streetNumber;
    private String floor;
    private String bell;
    private String city;
    private String zipCode;
    private String specificInstructions;
    private TypeAddress typeAddress;
    private String communicationPhoneNumber;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setBell(String bell) {
        this.bell = bell;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setSpecificInstructions(String specificInstructions) {
        this.specificInstructions = specificInstructions;
    }

    public void setTypeAddress(TypeAddress typeAddress) {
        this.typeAddress = typeAddress;
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

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", floor='" + floor + '\'' +
                ", bell='" + bell + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", specificInstructions='" + specificInstructions + '\'' +
                ", typeAddress=" + typeAddress +
                ", communicationPhoneNumber='" + communicationPhoneNumber + '\'' +
                '}';
    }
}
