package gr.athtech.mapper;

import gr.athtech.domain.OrderItem;
import gr.athtech.transfer.resource.OrderItemResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class)
public interface OrderItemMapper extends BaseMapper<OrderItem, OrderItemResource> {
}
