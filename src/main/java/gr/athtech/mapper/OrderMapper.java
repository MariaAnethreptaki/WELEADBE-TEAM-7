package gr.athtech.mapper;

import gr.athtech.domain.Order;
import gr.athtech.transfer.resource.OrderResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", config= IgnoreUnmappedMapperConfig.class)
public interface OrderMapper extends BaseMapper<Order, OrderResource> {

}