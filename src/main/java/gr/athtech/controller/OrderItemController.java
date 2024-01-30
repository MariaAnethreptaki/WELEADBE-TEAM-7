package gr.athtech.controller;

import gr.athtech.domain.OrderItem;
import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.OrderItemMapper;
import gr.athtech.service.BaseService;
import gr.athtech.service.OrderItemService;
import gr.athtech.transfer.ApiResponse;
import gr.athtech.transfer.resource.OrderItemResource;
import gr.athtech.transfer.resource.OrderItemResource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("orderItems")
public class OrderItemController extends BaseController<OrderItem, OrderItemResource> {
        private final OrderItemService orderItemService;
        private final OrderItemMapper orderItemMapper;

        @Override
        protected BaseService<OrderItem, Long> getBaseService() {
                return orderItemService;
        }

        @Override
        protected BaseMapper<OrderItem, OrderItemResource> getMapper() {
                return orderItemMapper;
        }
        @GetMapping(params = {"Id"})
        public ResponseEntity<ApiResponse<OrderItemResource>> findById(@RequestParam long Id) {
                return ResponseEntity.ok(ApiResponse.<OrderItemResource>builder()
                        .data(orderItemMapper.toResource(orderItemService.findById(Id)))
                        .build());
        }

        @PostMapping(params = "Id")
        public ResponseEntity<ApiResponse<OrderItemResource>> create(@RequestBody final OrderItemResource orderItemResource,
                                                                     @RequestParam Long Id) {
                var orderItem = orderItemMapper.toDomain(orderItemResource);
                return new ResponseEntity<>(
                        ApiResponse.<OrderItemResource>builder()
                                .data(getMapper().toResource(orderItemService.create(orderItem)))
                                .build(),
                        getNoCacheHeaders(),
                        HttpStatus.CREATED
                );
        }
}