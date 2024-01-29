package gr.athtech.service;

import gr.athtech.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import gr.athtech.domain.Account;


@Service
@RequiredArgsConstructor
public class AccountServiceImplementation extends BaseServiceImplementation<Account> implements AccountService {
    private AccountRepository accountRepository;

   // private PasswordEncoder passwordEncoder;


    @Override
    protected JpaRepository<Account, Long> getRepository() {
        return accountRepository;
    }


    public Account findByPhone(String phone) {
        return accountRepository.findByPhone(phone);
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

