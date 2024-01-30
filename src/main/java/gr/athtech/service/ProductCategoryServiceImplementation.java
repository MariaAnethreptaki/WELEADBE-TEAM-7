package gr.athtech.service;

import gr.athtech.repository.ProductCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import gr.athtech.domain.ProductCategory;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCategoryServiceImplementation extends BaseServiceImplementation<ProductCategory> implements ProductCategoryService {
    private final ProductCategoryRepository productCategoryRepository;


    @Override
    protected JpaRepository<ProductCategory, Long> getRepository() {
        return productCategoryRepository;
    }

    @Override
    public List<ProductCategory> getProductCategoryList() {
        return productCategoryRepository.findAll() ;
    }

    @Override
    public ProductCategory findById(long id) {
        return productCategoryRepository.findById(id);
    }
}