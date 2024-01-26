package gr.athtech.service;

import gr.athtech.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import gr.athtech.domain.Account;


@Service
@RequiredArgsConstructor
public class AccountServiceImplementation extends BaseServiceImplementation<Account> implements AccountService {
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    protected JpaRepository<Account, Long> getRepository() {
        return accountRepository;
    }


    @Override
    public Account findById(long id) {
        return null;
    }

    @Override
    public Account findByEmail(final String email) {
        {
            return accountRepository.findByEmail(email);
        }
    }


    @Autowired
    public AccountServiceImplementation(AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void createOrUpdateAccount(Account account) {
        String encodedPassword = passwordEncoder.encode(account.getPassword());
        account.setPassword(encodedPassword);
    }

}

