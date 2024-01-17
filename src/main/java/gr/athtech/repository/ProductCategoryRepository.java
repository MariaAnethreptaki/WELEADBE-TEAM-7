package gr.athtech.repository;

import gr.athtech.domain.Order;
import gr.athtech.domain.ProductCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends BaseRepository<ProductCategory, Long>{
}
