package gr.athtech.mapper;

import gr.athtech.domain.Account;
import gr.athtech.transfer.resource.AccountResource;
import org.mapstruct.Mapper;


@Mapper(componentModel= "spring", config = IgnoreUnmappedMapperConfig.class)
public interface AccountMapper extends BaseMapper<Account, AccountResource> {
}
