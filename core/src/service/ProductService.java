package core.src.service;

import core.src.domain.Product;
import core.src.domain.ProductCategory;

import java.util.List;

public interface ProductService{

    List<Product> getProducts();

    Product getProduct(String serial);

}
