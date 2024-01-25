package gr.athtech.mapper;

import gr.athtech.domain.ProductCategory;
import gr.athtech.transfer.resource.ProductCategoryResource;
import org.mapstruct.Mapper;

@Mapper(componentDomain= "spring", config=IgnoreUnmappedMapperConfig.class)
public interface ProductCategoryMapper extends BaseMapper<ProductCategory, ProductCategoryResource> {
}