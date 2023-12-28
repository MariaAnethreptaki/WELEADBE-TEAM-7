package main.domain;

import java.util.ArrayList;
import java.util.List;

public class StoreCategory extends BaseModel{
    private String nameCategory;
    private List<Store> stores = new ArrayList<>();
    private List<Store> famousStoresCategory = new ArrayList<>();

    public StoreCategory() {
    }

    public StoreCategory( String nameCategory, List<Store> stores, List<Store> famousStoresCategory) {
        this.nameCategory = nameCategory;
        this.stores = stores;
        this.famousStoresCategory = famousStoresCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public List<Store> getFamousStoresCategory() {
        return famousStoresCategory;
    }

    public void setFamousStoresCategory(List<Store> famousStoresCategory) {
        this.famousStoresCategory = famousStoresCategory;
    }
}
