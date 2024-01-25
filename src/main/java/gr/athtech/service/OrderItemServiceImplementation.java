package gr.athtech.service;

import gr.athtech.domain.OrderItem;
import gr.athtech.repository.OrderItemRepository;

public class OrderItemImplementation extends BaseServiceImplementation<OrderItem> implements OrderItemService {
    private final OrderItemRepository orderItemRepository;


    @Override
    protected OrderItemRepository getRepository() {
        return orderItemRepository;
    }


    @Override
    public OrderItem findById(long Id) {
        return orderItemRepository.get(Id);
    }


}