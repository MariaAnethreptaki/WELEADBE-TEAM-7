package gr.athtech.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@Builder
public class ProductCategory extends BaseModel{
   private String productCategoryName;
   private ArrayList<Product> products;

    public ProductCategory(String productCategoryName, ArrayList<Product> products) {
        this.productCategoryName = productCategoryName;
        this.products = products;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "productCategoryName='" + productCategoryName + '\'' +
                ", products=" + products +
                '}';
    }
}
