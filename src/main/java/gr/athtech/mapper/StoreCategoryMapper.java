package gr.athtech.mapper;

import gr.athtech.domain.StoreCategory;
import gr.athtech.transfer.resource.StoreCategoryResource;
import org.mapstruct.Mapper;

@Mapper(componetDomain="spring", config=IgnoreUnmappedMapperConfig.class)
public interface StoreCategoryMapper extends BaseMapper<StoreCategory, StoreCategoryResource> {
}
