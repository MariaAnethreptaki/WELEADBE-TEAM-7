package gr.athtech.service;

import gr.athtech.domain.ShippingAddress;
import gr.athtech.repository.ShippingAddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ShippingAddressServiceImplementation extends BaseServiceImplementation<ShippingAddress> implements ShippingAddressService{
    private  final ShippingAddressRepository shippingAddressRepo;

    @Override
    protected JpaRepository<ShippingAddress, Long> getRepository() {
        return shippingAddressRepo;
    }

//    @Override
//    public List<ShippingAddress> getShippingAddressList() {
//        return shippingAddressRepo.findAll();
//    }
//
//    @Override
//    public ShippingAddress getShippingAddress(long id) {
//        return shippingAddressRepo.findById(id);
//    }
}
