package gr.athtech.repository;

import gr.athtech.domain.Product;
import gr.athtech.domain.ProductCategory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class ProductCategoryImplementation extends BaseRepositoryImplementation<ProductCategory> implements ProductCategoryRepository {
    private final ConcurrentHashMap<Long, ProductCategory> storage = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    protected ConcurrentHashMap<Long, ProductCategory> getStorage() {
        return storage;
    }

    @Override
    protected AtomicLong getSequence() {
        return sequence;
    }

}
