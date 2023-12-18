package src.model.model;

import java.util.ArrayList;

public class ProductCategory {
   private String productCategoryName;
   public long categoryId;
   private ArrayList<Product> products;

    public ProductCategory(String productCategoryName, ArrayList<Product> products) {
        this.productCategoryName = productCategoryName;
        this.products = products;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
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
