package gr.athtech.controller;

import gr.athtech.domain.Account;
import gr.athtech.mapper.AccountMapper;
import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.AccountMapper;
import gr.athtech.domain.Account;
import gr.athtech.service.AccountService;
import gr.athtech.service.BaseService;
import gr.athtech.service.AccountService;
import gr.athtech.transfer.ApiResponse;
import gr.athtech.transfer.resource.AccountResource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("accounts")
public class AccountController extends BaseController<Account, AccountResource> {
	private final AccountService accountService;
	private final AccountMapper accountMapper;

	@Override
	protected BaseService<Account, Long> getBaseService() {
		return accountService;
	}

	@Override
	protected BaseMapper<Account, AccountResource> getMapper() {
		return accountMapper;
	}
//	@GetMapping(params = {"email"})
//	public ResponseEntity<ApiResponse<AccountResource>> findByEmail(@RequestParam String email) {
//		return ResponseEntity.ok(ApiResponse.<AccountResource>builder()
//				.data(accountMapper.toResource(accountService.findByEmail(email)))
//				.build());
//	}
//
//	@GetMapping(params = {"phoneNumber"})
//	public ResponseEntity<ApiResponse<AccountResource>> findByPhone(@RequestParam String phoneNumber) {
//		return ResponseEntity.ok(ApiResponse.<AccountResource>builder()
//				.data(accountMapper.toResource(accountService.findByPhone(phoneNumber)))
//				.build());
//	}
}
