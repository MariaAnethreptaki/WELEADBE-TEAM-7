package gr.athtech.service;

import gr.athtech.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface AccountService extends BaseService<Account,Long> {
    Account findById(long id);
    Account findByEmail(String email);

}
