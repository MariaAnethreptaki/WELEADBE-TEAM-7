package gr.athtech.repository;

import org.springframework.stereotype.Repository;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import gr.athtech.domain.StoreCategory;


@Repository
public abstract class StoreCategoryRepositoryImplementation extends BaseRepositoryImplementation<StoreCategory> implements StoreCategoryRepository {
	private final ConcurrentHashMap<Long, StoreCategory> storage = new ConcurrentHashMap<>();
	private final AtomicLong sequence = new AtomicLong(0);

	@Override
	protected ConcurrentHashMap<Long, StoreCategory> getStorage() {
		return storage;
	}

	@Override
	protected AtomicLong getSequence() {
		return sequence;
	}

	@Override
	public StoreCategory findByDescription(final String description) {
		return storage.values()
					  .stream()
					  .filter(c -> description.equalsIgnoreCase(c.getDescription()))
					  .findFirst()
					  .orElse(null);
	}

	@Override
	public StoreCategory findByName(final String name) {
		return storage.values()
					  .stream()
					  .filter(c -> name.equalsIgnoreCase(c.getNameCategory()))
					  .findFirst()
					  .orElse(null);
	}

	@Override
	public StoreCategory findMostFamousStoresByCategory() {
		return (null);
	}


}
