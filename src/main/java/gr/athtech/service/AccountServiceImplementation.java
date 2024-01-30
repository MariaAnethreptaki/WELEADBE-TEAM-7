package gr.athtech.service;

import gr.athtech.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import gr.athtech.domain.Account;


@Service
@RequiredArgsConstructor
public class AccountServiceImplementation extends BaseServiceImplementation<Account> implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

   // private PasswordEncoder passwordEncoder;


    @Override
    protected JpaRepository<Account, Long> getRepository() {
        return accountRepository;
    }

    @Override
    public Account findByphoneNumber(String phoneNumber) {
        return accountRepository.findByphoneNumber(phoneNumber);
    }


    @Override
    public Account findByEmail(final String email) {

        return accountRepository.findByEmail(email);

    }

/*
    public void createOrUpdateAccount(Account account) {
        String encodedPassword = passwordEncoder.encode(account.getPassword());
        account.setPassword(encodedPassword);
    }
*/
}

