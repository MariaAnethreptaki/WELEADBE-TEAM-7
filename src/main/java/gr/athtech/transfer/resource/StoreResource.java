package gr.athtech.transfer.resource;

import gr.athtech.domain.ProductCategory;
import gr.athtech.domain.Store;
import gr.athtech.domain.StoreCategory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
public class StoreResource extends BaseResource {
    private String storeName;
    private String storeLocation;
    private double rate;
    private Set<ProductCategory> menu;
    private boolean status;
    private StoreCategory storeCategory;
}
