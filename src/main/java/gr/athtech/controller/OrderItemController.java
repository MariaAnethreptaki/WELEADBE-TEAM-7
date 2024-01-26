package gr.athtech.controller;

import gr.athtech.domain.OrderItem;
import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.OrderItemMapper;
import gr.athtech.service.BaseService;
import gr.athtech.service.OrderItemService;
import gr.athtech.transfer.resource.OrderItemResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        }