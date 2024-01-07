package main.repository;

import org.springframework.stereotype.Repository;
import main.domain.StoreCategory;

@Repository
public interface StoreCategoryRepository extends BaseRepository<StoreCategory, Long> {
	StoreCategory findByDescription(String description);
	StoreCategory findByName(String name);

	StoreCategory findMostFamousStoresByCategory();
}
