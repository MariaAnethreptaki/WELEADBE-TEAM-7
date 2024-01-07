package main.service;

import main.domain.StoreCategory;

public interface StoreCategoryService extends BaseService<StoreCategory, Long> {
	StoreCategory findByDescription(String description); // (1)
	StoreCategory findByName(String name);
	StoreCategory findMostFamousStoresByCategory();
}
