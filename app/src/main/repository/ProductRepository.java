package main.repository;

import main.domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product, Long> {
	Product findBySerial(final String serial);
}
