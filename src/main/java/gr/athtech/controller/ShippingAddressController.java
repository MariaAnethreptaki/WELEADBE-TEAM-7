package gr.athtech.controller;

import gr.athtech.domain.ShippingAddress;
import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.ShippingAddressMapper;
import gr.athtech.service.BaseService;
import gr.athtech.service.ShippingAddressService;
import gr.athtech.transfer.resource.ShippingAddressResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("shippingAddresses")
public class ShippingAddressController extends BaseController<ShippingAddress, ShippingAddressResource> {
    private final ShippingAddressService shippingAddressService;
    private final ShippingAddressMapper shippingAddressMapper;

    @Override
    protected BaseService<ShippingAddress, Long> getBaseService() {
        return shippingAddressService;
    }

    @Override
    protected BaseMapper<ShippingAddress, ShippingAddressResource> getMapper() {
        return shippingAddressMapper;
    }
}
