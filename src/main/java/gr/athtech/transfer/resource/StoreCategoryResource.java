package gr.athtech.transfer.resource;

import gr.athtech.domain.Store;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
public class StoreCategoryResource extends BaseResource {
    private String nameCategory;
    private String description;
    private Set<Store> stores ;
    private Set<Store> famousStoresCategory ;
}
