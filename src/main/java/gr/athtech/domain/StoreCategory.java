package gr.athtech.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
public class StoreCategory extends BaseModel{
    private String nameCategory;

    private String description;
    private List<Store> stores = new ArrayList<>();
    private List<Store> famousStoresCategory = new ArrayList<>();

    public StoreCategory() {
    }

    public StoreCategory( String nameCategory, List<Store> stores, List<Store> famousStoresCategory) {
        this.nameCategory = nameCategory;
        this.stores = stores;
        this.famousStoresCategory = famousStoresCategory;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public void setFamousStoresCategory(List<Store> famousStoresCategory) {
        this.famousStoresCategory = famousStoresCategory;
    }
}
