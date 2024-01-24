package gr.athtech.controller;

import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.CustomerMapper;
import gr.athtech.model.Customer;
import gr.athtech.service.BaseService;
import gr.athtech.service.CustomerService;
import gr.athtech.transfer.resource.AccountResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("customers")
public class CustomerController extends BaseController<Customer, AccountResource> {
	private final CustomerService customerService;
	private final CustomerMapper customerMapper;

	@Override
	protected BaseService<Customer, Long> getBaseService() {
		return customerService;
	}

	@Override
	protected BaseMapper<Customer, AccountResource> getMapper() {
		return customerMapper;
	}
}
