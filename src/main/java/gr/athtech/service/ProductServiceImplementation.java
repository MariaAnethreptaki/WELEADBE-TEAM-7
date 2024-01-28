package gr.athtech.service;

import gr.athtech.domain.Product;
import gr.athtech.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImplementation extends BaseServiceImplementation<Product> implements ProductService {
    private  ProductRepository productRepository;
    private  ProductCategoryService categoryService;

    @Override
    protected JpaRepository<Product, Long> getRepository() {
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

    @Override
    public Product findBySerial(final String serial) {
        return productRepository.findBySerial(serial);
    }

    @Override
    public Product create(final Product product, final Long categoryId) {
        var category = categoryService.get(categoryId);
        product.setCategory(category);
        return productRepository.create(product,categoryId);
    }
}

