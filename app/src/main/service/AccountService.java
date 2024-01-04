package gr.codelearn.spring.showcase.app.service;

import gr.codelearn.spring.showcase.app.model.Account;

public interface AccountService extends BaseService<Account,Long> {
    Account findByEmail(String email);
}
