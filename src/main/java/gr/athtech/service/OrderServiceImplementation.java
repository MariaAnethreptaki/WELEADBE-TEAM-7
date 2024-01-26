package gr.athtech.service;

import gr.athtech.domain.*;
import gr.athtech.domain.enumPackage.PaymentInfo;
import gr.athtech.repository.OrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderServiceImplementation extends BaseServiceImplementation<Order> implements OrderService {
	private final OrderRepository orderRepository;

	public OrderServiceImplementation(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	protected JpaRepository<Order, Long> getRepository() {
		return orderRepository;
	}

	@Override
	public Order initiateOrder(Account customer) {//todo fix
		return null;
	}

	@Override
	public void addItem(Order order, Product product, int quantity) {//todo fix

	}

	@Override
	public void updateItem(Order order, Product product, int quantity) {//todo fix

	}

	@Override
	public void removeItem(Order order, Product product) {//todo fix

	}

	@Override
	public void checkout(Order order, PaymentInfo paymentMethod) {//todo fix

	}

}
