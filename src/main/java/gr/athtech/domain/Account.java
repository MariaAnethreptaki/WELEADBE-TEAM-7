package gr.athtech.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * This class handles the private information of every user.
 */
@Getter
@Builder
public class Account extends BaseModel{
    /*attributes*/
    private String surname;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private List<ShippingAddress> shippingAddresses;
    private List<Order> allPlacedOrders;

    public Account(String password, String phoneNumber) {
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setShippingAddresses(List<ShippingAddress> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }

    @Override
    public String toString() {
        return "Account{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", shippingAddresses=" + shippingAddresses +
                ", allPlacedOrders=" + allPlacedOrders +
                '}';
    }

    public void setAllPlacedOrders(List<Order> allPlacedOrders) {
        this.allPlacedOrders = allPlacedOrders;
    }
}