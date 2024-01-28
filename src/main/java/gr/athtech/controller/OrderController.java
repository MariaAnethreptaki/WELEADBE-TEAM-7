package gr.athtech.controller;

import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.OrderMapper;
import gr.athtech.domain.Order;
import gr.athtech.service.BaseService;
import gr.athtech.service.OrderService;
import gr.athtech.transfer.resource.OrderResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController extends BaseController<Order, OrderResource> {
	private final OrderService orderService;
	private final OrderMapper orderMapper;

	@Override
	protected BaseService<Order, Long> getBaseService() {
		return orderService;
	}

	@Override
	protected BaseMapper<Order, OrderResource> getMapper() {
		return orderMapper;
	}
}
