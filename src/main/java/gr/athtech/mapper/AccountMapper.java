package gr.athtech.mapper;

import gr.athtech.domain.Account;
import gr.athtech.transfer.resource.AccountResource;
import org.mapstruct.mapper;

@Mapper(componentDomain= "spring", config = IgnoreUnmappedMapperConfig.class)
public interface AccountMapper extends BaseMapper<Account, AccountResource> {
}
