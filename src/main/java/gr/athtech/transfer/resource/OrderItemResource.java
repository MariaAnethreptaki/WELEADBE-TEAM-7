package gr.athtech.transfer.resource;

import gr.athtech.domain.Order;
import gr.athtech.domain.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
public class OrderItemResource extends BaseResource {
	private Product product;
	private Integer quantity;
	private BigDecimal price;
}
