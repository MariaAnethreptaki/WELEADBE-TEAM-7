import java.util.Date;
/** This class handles the private information of every order.
* create OrderItem to generate the OrderId
*/
public class Orders {
    /*attributes*/
    private String OrderId;
    public Account customerId;
    public String shippingAddress;
    public List<Product> products;
    public Date orderDate;
    public String status;//TODO ENUM
    public String paymentInfo;//TODO ENUM

    public String getOrderId() {
        return OrderId;
    }

    public Account getCustomerId() {
        return customerId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public void setCustomerId(Account customerId) {
        this.customerId = customerId;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public Orders(Account customerId, String shippingAddress, List<Product> products, Date orderDate, String status, String paymentInfo) {
        this.customerId = customerId;
        this.shippingAddress = shippingAddress;
        this.products = products;
        this.orderDate = orderDate;
        this.status = status;
        this.paymentInfo = paymentInfo;
    }
}
