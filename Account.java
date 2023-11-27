import java.util.List;

/**
 * This class handles the private information of every user.
 * Potentially we need to :
 * 1)create AccountItem class in order to generate the AccountId
 * 2)create ShippingAddress class to handle the details of shippingAddress
 * (Street name, street number, country, postcode etc.)
 */
public class Account{
    /*attributes*/
    public String accountId;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private List<ShippingAddress> shippingAddresses;
    private List<Orders> allPlacedOrders;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Account(String username, String email, String password, String phoneNumber) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public Account(String password, String phoneNumber) {
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
