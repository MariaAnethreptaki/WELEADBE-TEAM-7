package gr.athtech.service;

import gr.athtech.domain.StoreCategory;
import gr.athtech.repository.StoreCategoryRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreCategoryServiceImplementation extends BaseServiceImplementation<StoreCategory> implements StoreCategoryService {
	private StoreCategoryRepository categoryRepository;

	@Override
	protected JpaRepository<StoreCategory, Long> getRepository() {
		return categoryRepository;
	}

	@Override
	public StoreCategory findByDescription(final String description) {
		return categoryRepository.findByDescription(description);
	}

	@Override
	public StoreCategory findByName(final String name) {
		return categoryRepository.findByDescription(name);
	}

	@Override
	public StoreCategory findMostFamousStoresByCategory() {
		return categoryRepository.findMostFamousStoresByCategory();
	}
}
