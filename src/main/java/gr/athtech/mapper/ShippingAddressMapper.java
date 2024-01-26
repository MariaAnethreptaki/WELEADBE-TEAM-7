package gr.athtech.mapper;

import gr.athtech.domain.ShippingAddress;
import gr.athtech.transfer.resource.ShippingAddressResource;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring", config=IgnoreUnmappedMapperConfig.class)
public interface ShippingAddressMapper extends BaseMapper<ShippingAddress, ShippingAddressResource> {
}
