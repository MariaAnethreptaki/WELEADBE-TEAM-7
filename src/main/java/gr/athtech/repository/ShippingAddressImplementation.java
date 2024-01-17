package gr.athtech.repository;

import gr.athtech.domain.Product;
import gr.athtech.domain.ShippingAddress;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class ShippingAddressImplementation extends BaseRepositoryImplementation<ShippingAddress> implements ShippingAddressRepository {
    private final ConcurrentHashMap<Long, ShippingAddress> storage = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    protected ConcurrentHashMap<Long, ShippingAddress> getStorage() {
        return storage;
    }

    @Override
    protected AtomicLong getSequence() {
        return sequence;
    }


    @Override
    public ShippingAddress findById(long id) {//TODO FIX
        return null;
    }
}
