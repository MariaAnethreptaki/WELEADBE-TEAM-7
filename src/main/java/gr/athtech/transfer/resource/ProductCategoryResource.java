package gr.athtech.transfer.resource;

import gr.athtech.domain.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
public class ProductCategoryResource extends BaseResource {
	private String productCategoryName;
	private Set<Product> products;
}
