package gr.athtech.transfer.resource;

import gr.athtech.domain.Store;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@ToString(callSuper = true)
public class StoreCategory extends BaseResource {
    private String nameCategory;
    private String description;
    private List<Store> stores = new ArrayList<>();
    private List<Store> famousStoresCategory = new ArrayList<>();
}
