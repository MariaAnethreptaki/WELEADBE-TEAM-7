package gr.athtech.service;

import gr.athtech.repository.ProductCategoryRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import gr.athtech.domain.ProductCategory;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCategoryServiceImplementation extends BaseServiceImplementation<ProductCategory> implements ProductCategoryService {
    private ProductCategoryRepository productCategoryRepo;


    @Override
    protected JpaRepository<ProductCategory, Long> getRepository() {
        return productCategoryRepo;
    }

    @Override
    public List<ProductCategory> getProductCategoryList() {
        return productCategoryRepo.findAll() ;
    }

    @Override
    public ProductCategory getProductCategory(long id) {
        return productCategoryRepo.findById(id);
    }
}