package gr.athtech.repository;

import org.springframework.stereotype.Repository;
import gr.athtech.domain.StoreCategory;

@Repository
public interface StoreCategoryRepository extends BaseRepository<StoreCategory, Long> {
	StoreCategory findByDescription(String description);
	StoreCategory findByName(String name);

	StoreCategory findMostFamousStoresByCategory();
}
