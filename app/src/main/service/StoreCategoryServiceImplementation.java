package main.service;

import main.domain.StoreCategory;
import main.repository.BaseRepository;
import main.repository.StoreCategoryRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreCategoryServiceImplementation extends BaseServiceImplementation<StoreCategory> implements StoreCategoryService {
	private StoreCategoryRepository categoryRepository;

	@Override
	protected BaseRepository<StoreCategory, Long> getRepository() {
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
