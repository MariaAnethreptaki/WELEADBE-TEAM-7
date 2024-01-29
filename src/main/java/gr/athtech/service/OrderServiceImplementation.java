package gr.athtech.service;

import gr.athtech.domain.*;
import gr.athtech.domain.enumPackage.PaymentInfo;
import gr.athtech.domain.enumPackage.StatusOfOrder;
import gr.athtech.repository.OrderRepository;
import gr.athtech.transfer.KeyValue;
import gr.athtech.transfer.PurchasesAndCostPerCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImplementation extends BaseServiceImplementation<Order> implements OrderService {
	private  OrderRepository orderRepository;

	@Override
	protected JpaRepository<Order, Long> getRepository() {
		return orderRepository;
	}

//	@Override
//	public Order initiateOrder(final Account account) {
//		return Order.builder().customerId(account).build();
//	}
//
//	@Override
//	public void addItem(final Order order, final Product product, final int quantity) {
//		if (checkNullability(order, product)) {
//			return;
//		}
//
//		boolean increasedQuantity = false;
//
//		// If product is already contained in the order, don't add it again, just increase the quantity accordingly
//		for (OrderItem oi : order.getOrderItems()) {
//			if (oi.getProduct().getSerialNumber().equals(product.getSerialNumber())) {
//				oi.setQuantity(oi.getQuantity() + quantity);
//				increasedQuantity = true;
//				break;
//			}
//		}
//
//		if (!increasedQuantity) {
//			order.getOrderItems().add(newOrderItem(order, product, quantity));
//		}
//
//		logger.trace("Product[{}] added to Order[{}]", product, order);
//	}
//
//	@Override
//	public void updateItem(final Order order, final Product product, final int quantity) {
//		if (checkNullability(order, product)) {
//			return;
//		}
//
//		order.getOrderItems().removeIf(oi -> oi.getProduct().getSerialNumber().equals(product.getSerialNumber()));
//		order.getOrderItems().add(newOrderItem(order, product, quantity));
//
//		logger.trace("Product[{}] updated in Order[{}]", product, order);
//	}
//
//	@Override
//	public void removeItem(final Order order, final Product product) {
//		if (checkNullability(order, product)) {
//			return;
//		}
//		order.getOrderItems().removeIf(oi -> oi.getProduct().getSerialNumber().equals(product.getSerialNumber()));
//		logger.trace("Product[{}] removed from Order[{}]", product, order);
//	}
//	@Override
//	public Order checkout(final Order order, final PaymentInfo paymentMethod) {
//		if (!validate(order)) {
//			logger.warn("Order should have account, order items, and payment type defined before being able to " +
//					"checkout the order.");
//			return null;
//		}
//
//		// Set all order fields with proper values
//		order.setPaymentInfo(paymentMethod);
//		order.setOrderDate(new Date());
//		order.setStatus(StatusOfOrder.SHIPPED);
//
//		return create(order);
//
//	}
//
//	public Optional<Order> findWithAccount(Long id) {
//		return orderRepository.findWithAccount(id);
//	}
//
////	public Optional<Order> findWithAllAssociations(Long id) {
////		return orderRepository.findWithAllAssociations(id);
////	}
//
//	public List<KeyValue<String, BigDecimal>> findAverageOrderCostPerAccount() {
//		return orderRepository.findAverageOrderCostPerCustomer();
//	}
//
//	public List<PurchasesAndCostPerCustomer> findTotalNumberAndCostOfPurchasesPerAccountCategory() {
//		return orderRepository.findTotalNumberAndCostOfPurchasesPerCustomerCategory();
//	}
//
//	private boolean checkNullability(Order order, Product product) {
//		if (order == null) {
//			logger.warn("Order is null therefore it cannot be processed.");
//			return true;
//		}
//		if (product == null) {
//			logger.warn("Product is null therefore it cannot be added to an order.");
//			return true;
//		}
//		return false;
//	}
//
//	private boolean validate(Order order) {
//		return order != null && !order.getOrderItems().isEmpty() && order.getCustomerId()!= null;
//	}
//
//	private OrderItem newOrderItem(Order order, Product product, int quantity) {
//		return OrderItem.builder().product(product).quantity(quantity).price(product.getPrice()).order(order).build();
//	}
}

