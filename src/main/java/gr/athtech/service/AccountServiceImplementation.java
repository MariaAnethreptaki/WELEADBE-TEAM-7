package gr.athtech.service;

import gr.athtech.repository.AccountRepository;
import gr.athtech.repository.BaseRepositoryImplementation;
import org.springframework.stereotype.Service;
import gr.athtech.domain.Account;
@Service
@RequiredArgsConstructor
public class AccountServiceImplementation extends BaseServiceImplementation<Account> implements AccountService {
    private final AccountRepository accountRepository;

    public AccountServiceImplementation(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    protected AccountRepository getRepository() {
        return accountRepository;
    }


    @Override
    public Account findById(long Id) {
        return accountRepository.get(Id);
    }
}

