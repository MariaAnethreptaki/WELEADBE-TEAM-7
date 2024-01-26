package gr.athtech.transfer.resource;

import gr.athtech.domain.ProductCategory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString(callSuper = true)
public class ProductResource extends BaseResource {
	public String serialNumber;
	private String productName;
	private String description;
	private double price;
	private boolean available;
	private ProductCategory category;
}
