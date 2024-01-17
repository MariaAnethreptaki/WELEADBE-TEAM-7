package gr.athtech.domain;

import lombok.Builder;
import lombok.Getter;
import gr.athtech.domain.enumPackage.PaymentInfo;
import gr.athtech.domain.enumPackage.StatusOfOrder;

import java.util.Date;
import java.util.List;

/** This class handles the private information of every order.
* create OrderItem to generate the OrderId
*/
@Getter
@Builder
public class Order extends BaseModel{
    /*attributes*/
    public Account customerId;
    public List<Product> products;
    public Date orderDate;
    public StatusOfOrder status;
    public PaymentInfo paymentInfo;


    public Order(Account customerId, String shippingAddress, List<Product> products, Date orderDate, StatusOfOrder status, PaymentInfo paymentInfo) {
        this.customerId = customerId;
        this.products = products;
        this.orderDate = orderDate;
        this.status = status;
        this.paymentInfo = paymentInfo;
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

    public void setStatus(StatusOfOrder status) {
        this.status = status;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

}
