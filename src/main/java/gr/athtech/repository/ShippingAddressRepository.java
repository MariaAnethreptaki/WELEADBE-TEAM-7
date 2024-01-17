package gr.athtech.repository;

import gr.athtech.domain.ShippingAddress;
import gr.athtech.domain.StoreCategory;

public interface ShippingAddressRepository extends BaseRepository<ShippingAddress, Long> {
    ShippingAddress findById(long id);

}
