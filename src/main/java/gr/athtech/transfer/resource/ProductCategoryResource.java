package gr.athtech.transfer.resource;

import gr.athtech.domain.Product;
import gr.athtech.domain.Store;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
public class ProductCategoryResource extends BaseResource {
	private String productCategoryName;
	private Store store;
	private Set<Product> products;
}
