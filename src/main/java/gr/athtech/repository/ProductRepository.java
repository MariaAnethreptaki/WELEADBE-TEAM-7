package gr.athtech.repository;

import gr.athtech.domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product, Long> {
	Product findBySerial(final String serial);
}
