package gr.athtech.transfer.resource;

import com.fasterxml.jackson.annotation.JsonFormat;
import gr.athtech.domain.Account;
import gr.athtech.domain.OrderItem;
import gr.athtech.domain.enumPackage.PaymentInfo;
import gr.athtech.domain.enumPackage.StatusOfOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@ToString(callSuper = true)
public class OrderResource extends BaseResource {
	public Account customerId;
	public Set<OrderItemResource> orderItems = new HashSet<>();;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss.SSS")
	public Date orderDate;
	public StatusOfOrder status;
	public PaymentInfo paymentInfo;
	private BigDecimal cost;
}