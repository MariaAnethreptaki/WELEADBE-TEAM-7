package src;

import java.util.ArrayList;

public class ProductCategory {
   private String productCategoryName;
   private ArrayList<Product> products;

    public ProductCategory(String productCategoryName, ArrayList<Product> products) {
        this.productCategoryName = productCategoryName;
        this.products = products;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public ArrayList<Product> getProducts() {
        return products;
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
