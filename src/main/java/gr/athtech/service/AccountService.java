package gr.athtech.service;

import gr.athtech.domain.Account;

public interface AccountService extends BaseService<Account,Long> {
    Account findById(long Id);

}
