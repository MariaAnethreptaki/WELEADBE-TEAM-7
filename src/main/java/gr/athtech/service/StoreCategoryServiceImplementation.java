package gr.athtech.service;

import gr.athtech.domain.Store;
import gr.athtech.domain.StoreCategory;
import gr.athtech.repository.StoreCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreCategoryServiceImplementation extends BaseServiceImplementation<StoreCategory> implements StoreCategoryService {
	private final StoreCategoryRepository storeCategoryRepository;

	@Override
	protected JpaRepository<StoreCategory, Long> getRepository() {
		return storeCategoryRepository;
	}

	@Override
	public StoreCategory findById(long Id) {
		return storeCategoryRepository.findById(Id);
	}


//	@Override
//	public StoreCategory findById(long Id) {
//		return storeCategoryRepository.findById(Id);}

//
//	@Override
//	public StoreCategory findByName(final String name) {
//		return categoryRepository.findByDescription(name);
//	}
//
//	@Override
//	public StoreCategory findMostFamousStoresByCategory() {
//		return categoryRepository.findMostFamousStoresByCategory();
//	}
}
