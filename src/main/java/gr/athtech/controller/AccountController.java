package gr.athtech.controller;

import gr.athtech.domain.Account;
import gr.athtech.mapper.AccountMapper;
import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.AccountMapper;
import gr.athtech.domain.Account;
import gr.athtech.service.AccountService;
import gr.athtech.service.BaseService;
import gr.athtech.service.AccountService;
import gr.athtech.transfer.resource.AccountResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("accounts")
public class AccountController extends BaseController<Account, AccountResource> {
	private final AccountService accountService;
	private final AccountMapper customerMapper;

	@Override
	protected BaseService<Account, Long> getBaseService() {
		return accountService;
	}

	@Override
	protected BaseMapper<Account, AccountResource> getMapper() {
		return customerMapper;
	}
}
