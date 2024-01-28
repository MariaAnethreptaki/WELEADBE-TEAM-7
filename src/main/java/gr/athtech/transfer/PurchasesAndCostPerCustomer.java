package gr.athtech.transfer;

import java.math.BigDecimal;

public interface PurchasesAndCostPerCustomer {
	String getCategory();

	Long getPurchases();

	BigDecimal getCost();
}
