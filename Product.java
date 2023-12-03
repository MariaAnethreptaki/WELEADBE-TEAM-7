package org.example;

import java.util.ArrayList;

public class Product {
    private String productId;
    private String ProductName;
    private String description;
    private ArrayList<String> ingredients; //todo decide the type of the ingredients, added String just to get rid of the error
    private double price;
    private boolean available;
    private ProductCategory category;

    public Product(String productName, String description, double price, boolean available, ProductCategory category) {
        ProductName = productName;
        this.description = description;
        this.price = price;
        this.available = available;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", description='" + description + '\'' +
                ", ingredients=" + ingredients +
                ", price=" + price +
                ", available=" + available +
                ", category=" + category +
                '}';
    }
}
