package gr.athtech.service;

import gr.athtech.repository.BaseRepository;
import gr.athtech.repository.ProductCategoryRepository;
import org.springframework.stereotype.Service;
import gr.athtech.domain.ProductCategory;

import java.util.List;

@Service
public class ProductCategoryServiceImplementation extends BaseServiceImplementation<ProductCategory> implements ProductCategoryService {
    private final ProductCategoryRepository productCategoryRepo;

    public ProductCategoryServiceImplementation(ProductCategoryRepository productCategoryRepo) {
        this.productCategoryRepo = productCategoryRepo;
    }

    @Override
    protected BaseRepository<ProductCategory, Long> getRepository() {
        return productCategoryRepo;
    }

    @Override
    public List<ProductCategory> getProductCategoryList() {
        return productCategoryRepo.findAll() ;
    }

    @Override
    public ProductCategory getProductCategory(long id) {
        return productCategoryRepo.get(id);
    }
}