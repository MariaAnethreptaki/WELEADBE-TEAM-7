package core.src.domain;

import java.util.List;

/**
 * This class handles the private information of every user.
 */

public class Account{
    /*attributes*/
    public long accountId;
    private String surname;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private List<ShippingAddress> shippingAddresses;
    private List<Orders> allPlacedOrders;


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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountId() {
        return accountId;///todo
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<ShippingAddress> getShippingAddresses() {
        return shippingAddresses;
    }

    public void setShippingAddresses(List<ShippingAddress> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }

    public List<Orders> getAllPlacedOrders() {
        return allPlacedOrders;
    }

    public void setAllPlacedOrders(List<Orders> allPlacedOrders) {
        this.allPlacedOrders = allPlacedOrders;
    }

}
