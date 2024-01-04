package main.service;

import main.repository.AccountRepository;
import org.springframework.stereotype.Service;
import main.domain.Account;
@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImplementation<Account> implements AccountService {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    protected AccountRepository getRepository() {
        return accountRepository;
    }
    @Override
    public Account findByEmail(final String email) {
        return null;
    }


}

