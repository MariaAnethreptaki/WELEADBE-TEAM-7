package main.service;

import main.domain.Product;
import main.domain.ProductCategory;
import main.repository.BaseRepository;
import main.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImplementation extends BaseServiceImplementation<Product> implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    protected BaseRepository<Product, Long> getRepository() {
        return productRepository;
    }

    public Product findBySerial(final String serialNumber) {
        return productRepository.findBySerial(serialNumber);
    }

    @Override
    public List<Product> getProducts() {//todo automatically generalized
        return null;
    }

    @Override
    public Product getProduct(String serialNumber) {//todo automatically generalized
        return null;
    }

    @Override
    public List<Product> createAll(List<Product> items) {//todo automatically generalized
        return null;
    }
}