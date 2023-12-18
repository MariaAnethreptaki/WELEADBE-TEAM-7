package service;

import src.model.modelStructure.Product;
import src.model.modelStructure.ProductCategory;

public interface ProductService extends BaseService<Product, Long> {

    Product findBySerial(String serial);//todo????

    Product create(Product product, ProductCategory category);

}
