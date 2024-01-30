package gr.athtech.service;

import gr.athtech.domain.StoreCategory;

public interface StoreCategoryService extends BaseService<StoreCategory, Long> {
//	StoreCategory findByDescription(String description); // (1)
//	StoreCategory findByName(String name);
	StoreCategory findById(long Id);

}
