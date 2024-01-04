package gr.codelearn.spring.showcase.app.service;

import lombok.RequiredArgsConstructor;
import gr.codelearn.spring.showcase.app.model.Account;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import gr.codelearn.spring.showcase.app.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImplementation<Account> implements AccountService {
    private final AccountRepository accountRepository;


    @Override
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}
    @Override
 protected JpaRepository<Account,Long> getRepository() {
        return accountRepository;
    }
    @Override
    public Account findByEmail(final String email) {
        return null;
}
