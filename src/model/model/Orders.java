package src.model.model;

import src.model.enumPackage.paymentInfo;
import src.model.enumPackage.statusOfOrder;

import java.util.Date;
import java.util.List;

/** This class handles the private information of every order.
* create OrderItem to generate the OrderId
*/
public class Orders {
    /*attributes*/
    public long OrderId;
    public Account customerId;
    public List<Product> products;
    public Date orderDate;
    public statusOfOrder status;
    public src.model.enumPackage.paymentInfo paymentInfo;//TODO ENUM


    public Orders(Account customerId, String shippingAddress, List<Product> products, Date orderDate, statusOfOrder status, paymentInfo paymentInfo) {
        this.customerId = customerId;
        this.products = products;
        this.orderDate = orderDate;
        this.status = status;
        this.paymentInfo = paymentInfo;
    }

    public long getOrderId() {
        return OrderId;
    }

    public Account getCustomerId() {
        return customerId;
    }


    public List<Product> getProducts() {
        return products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public statusOfOrder getStatus() {
        return status;
    }

    public paymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public void setCustomerId(Account customerId) {
        this.customerId = customerId;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(statusOfOrder status) {
        this.status = status;
    }

    public void setPaymentInfo(paymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

}
