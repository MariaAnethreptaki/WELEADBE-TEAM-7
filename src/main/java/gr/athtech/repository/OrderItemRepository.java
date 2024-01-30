package gr.athtech.repository;

import gr.athtech.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long> {
    OrderItem findById(long id);

}