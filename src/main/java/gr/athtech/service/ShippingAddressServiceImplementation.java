package gr.athtech.service;

import gr.athtech.domain.ProductCategory;
import gr.athtech.domain.ShippingAddress;
import gr.athtech.repository.BaseRepository;
import gr.athtech.repository.ProductCategoryRepository;
import gr.athtech.repository.ShippingAddressRepository;

import java.util.List;

public class ShippingAddressServiceImplementation extends BaseServiceImplementation<ShippingAddress> implements ShippingAddressService{
    private final ShippingAddressRepository shippingAddressRepo;

    public ShippingAddressServiceImplementation(ShippingAddressRepository shippingAddressRepo) {
        this.shippingAddressRepo = shippingAddressRepo;
    }

    @Override
    protected BaseRepository<ShippingAddress, Long> getRepository() {
        return shippingAddressRepo;
    }

    @Override
    public List<ShippingAddress> getShippingAddressList() {
        return shippingAddressRepo.findAll();
    }

    @Override
    public ShippingAddress getShippingAddress(long id) {
        return shippingAddressRepo.get(id);
    }
}
