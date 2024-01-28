package gr.athtech.transfer.resource;

import gr.athtech.domain.ProductCategory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
public class ProductResource extends BaseResource {
	public String serialNumber;
	private String productName;
	private String description;
	private BigDecimal price;
	private boolean available;
	private ProductCategory category;
}
