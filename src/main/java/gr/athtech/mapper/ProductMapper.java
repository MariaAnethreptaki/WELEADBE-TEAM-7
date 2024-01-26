package gr.athtech.mapper;

import gr.athtech.domain.Product;
import gr.athtech.transfer.resource.ProductResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class)
public interface ProductMapper extends BaseMapper<Product, ProductResource> {

}
