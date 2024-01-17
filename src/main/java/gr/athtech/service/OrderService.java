package gr.athtech.service;

import gr.athtech.domain.Account;
import gr.athtech.domain.Order;
import gr.athtech.domain.Product;
import gr.athtech.domain.enumPackage.PaymentInfo;

public interface OrderService extends BaseService<Order, Long> {
	Order initiateOrder(Account customer);

	void addItem(Order order, Product product, int quantity);

	void updateItem(Order order, Product product, int quantity);

	void removeItem(Order order, Product product);

	void checkout(Order order, PaymentInfo paymentMethod);

}
