package gr.athtech.repository;

import gr.athtech.domain.ProductCategory;
import gr.athtech.domain.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    //ProductCategory findById(long id);

}
