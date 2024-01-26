package gr.athtech.transfer.resource;

import gr.athtech.domain.BaseModel;
import gr.athtech.domain.Product;
import gr.athtech.domain.Store;
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
    private Set<Product> menu;
    private boolean status;
    private String storeCategory;
    private Set<Store> famousStores;
}
