package gr.athtech.service;

import gr.athtech.domain.OrderItem;
import gr.athtech.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderItemServiceImplementation extends BaseServiceImplementation<OrderItem> implements OrderItemService {
    private OrderItemRepository orderItemRepository;

    @Override
    protected JpaRepository<OrderItem, Long> getRepository() {
        return orderItemRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public OrderItem findById(long id) {
        return orderItemRepository.findById(id);    }
}
