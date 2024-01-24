package gr.athtech.mapper;

import gr.athtech.domain.Store;
import gr.athtech.transfer.resource.StoreResourse;
import org.mapstruct.Mapper;

@Mapper(componentDomain="spring", config=IgnoreUnmappedMapperConfig.class)
public interface StoreMapper extends BaseMapper<Store, StoreResourse> {
}
