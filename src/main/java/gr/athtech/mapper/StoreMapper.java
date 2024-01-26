package gr.athtech.mapper;

import gr.athtech.domain.Store;
import gr.athtech.transfer.resource.StoreResource;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring", config=IgnoreUnmappedMapperConfig.class)
public interface StoreMapper extends BaseMapper<Store, StoreResource> {
}
