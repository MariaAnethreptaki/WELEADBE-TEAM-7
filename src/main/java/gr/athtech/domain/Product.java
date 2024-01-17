package gr.athtech.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
@Getter
@Builder
public class Product extends BaseModel {
    public String serialNumber;
    private String productName;
    private String description;
    private ArrayList<String> ingredients; //todo decide the type of the ingredients, added String just to get rid of the error
    private double price;
    private boolean available;
    private ProductCategory category;

    public Product(String productName, String description, double price, boolean available, ProductCategory category) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.available = available;
        this.category = category;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + serialNumber + '\'' +
                ", ProductName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", ingredients=" + ingredients +
                ", price=" + price +
                ", available=" + available +
                ", category=" + category +
                '}';
    }
}
