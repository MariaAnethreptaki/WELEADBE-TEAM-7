package gr.athtech.service;

import gr.athtech.domain.Product;
import gr.athtech.domain.ProductCategory;
import gr.athtech.repository.BaseRepository;
import gr.athtech.repository.ProductRepository;
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

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String serialNumber) {
        return productRepository.findBySerial(serialNumber);
    }


}