package main.service;

import main.repository.AccountRepository;
import org.springframework.stereotype.Service;
import main.domain.Account;
@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImplementation<Account> implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    protected AccountRepository<Account,Long> getRepository() {
        return accountRepository;
    }
    @Override
    public Account findByEmail(final String email) {
        return null;
    }
    @Override
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}

