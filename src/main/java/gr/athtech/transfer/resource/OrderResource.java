package gr.athtech.transfer.resource;

import gr.athtech.domain.Account;
import gr.athtech.domain.Product;
import gr.athtech.domain.enumPackage.PaymentInfo;
import gr.athtech.domain.enumPackage.StatusOfOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@ToString(callSuper = true)
public class OrderResource extends BaseResource {
	public Account customerId;
	public Set<Product> products;
	public Date orderDate;
	public StatusOfOrder status;
	public PaymentInfo paymentInfo;
	private BigDecimal cost;
}
