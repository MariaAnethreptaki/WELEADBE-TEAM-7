package gr.athtech.repository;

import gr.athtech.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	//Product findBySerial(final String serial);
	//Product create(Product product, Long categoryId);
}
