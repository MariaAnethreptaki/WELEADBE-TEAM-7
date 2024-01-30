package gr.athtech.controller;

import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.OrderMapper;
import gr.athtech.domain.Order;
import gr.athtech.service.BaseService;
import gr.athtech.service.OrderService;
import gr.athtech.transfer.ApiResponse;
import gr.athtech.transfer.resource.OrderItemResource;
import gr.athtech.transfer.resource.OrderResource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping(params = {"Id"})
	public ResponseEntity<ApiResponse<OrderResource>> findById(@RequestParam long Id) {
		return ResponseEntity.ok(ApiResponse.<OrderResource>builder()
				.data(orderMapper.toResource(orderService.findById(Id)))
				.build());
	}

}