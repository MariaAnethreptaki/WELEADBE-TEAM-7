package gr.athtech.transfer.resource;

import gr.athtech.domain.Store;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
public class StoreCategoryResource extends BaseResource {
    private String storeCategoryName;
    private String description;
    private Set<Store> stores ;
}
