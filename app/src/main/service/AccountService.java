package main.service;

import main.domain.Account; ...

public interface AccountService extends BaseService<Account,Long> {
    Account findByEmail(String email);
}
