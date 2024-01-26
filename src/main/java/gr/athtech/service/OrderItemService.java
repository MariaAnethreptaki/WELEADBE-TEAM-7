package gr.athtech.service;

import gr.athtech.domain.OrderItem;

public interface OrderItemService extends BaseService<OrderItem,Long> {
    OrderItem findById(long Id);

}