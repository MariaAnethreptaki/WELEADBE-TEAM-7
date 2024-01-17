package gr.athtech.service;

import gr.athtech.domain.*;
import gr.athtech.domain.enumPackage.PaymentInfo;
import gr.athtech.repository.BaseRepository;
import gr.athtech.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImplementation extends BaseServiceImplementation<Order> implements OrderService {
	private final OrderRepository orderRepository;

	public OrderServiceImplementation(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	protected BaseRepository<Order, Long> getRepository() {
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
