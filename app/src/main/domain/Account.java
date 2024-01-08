package main.domain;

import java.util.List;

/**
 * This class handles the private information of every user.
 */
public class Account extends BaseModel{
    /*attributes*/
    private String surname;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private List<ShippingAddress> shippingAddresses;
    private List<Order> allPlacedOrders;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<ShippingAddress> getShippingAddresses() {
        return shippingAddresses;
    }

    public List<Order> getAllPlacedOrders() {
        return allPlacedOrders;
    }

    public Account(String surname, String name, String email, String password, String phoneNumber) {
        this.surname = surname;
        this.name=name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

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

    public void setAllPlacedOrders(List<Order> allPlacedOrders) {
        this.allPlacedOrders = allPlacedOrders;
    }
}