package gr.athtech.bootstrap;

import gr.athtech.domain.enumPackage.TypeAddress;
import lombok.RequiredArgsConstructor;
import gr.athtech.domain.Account;
import gr.athtech.domain.Product;
import gr.athtech.domain.ProductCategory;
import gr.athtech.domain.ShippingAddress;
import gr.athtech.service.AccountService;
import gr.athtech.service.ProductCategoryService;
import gr.athtech.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import  gr.athtech.base.BaseComponent;
import java.math.BigDecimal;
import java.util.*;

@Component
@Profile("generate-catalog-customers")
@RequiredArgsConstructor
public class CatalogCustomerSampleContentCreator extends BaseComponent implements CommandLineRunner {
	private final ProductService productService;
	private final ProductCategoryService productCategoryService;
	private final AccountService user;

	@Override
	public void run(String... args) throws Exception {
		ProductCategory newCategory = productCategoryService.create(ProductCategory.builder().productCategoryName("SOUBLAKIA").build());
		logger.info("Created {}.", newCategory);

		List<Product> products = List.of(
				Product.builder().serialNumber("SN1000-0001").productName("GYROS KOTOPOULO")
						.price(BigDecimal.valueOf(3.8).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1000-0002").productName("GYROS XOIRINO")
						.price(BigDecimal.valueOf(3.5).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1100-0001").productName("GYROS ANAMEIKTOS")
						.price(BigDecimal.valueOf(3.6).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1100-0002").productName("SOUBLAKI KOTOPOULO")
						.price(BigDecimal.valueOf(4.5).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1200-0001").productName("SOUBLAKI XOIRINO")
						.price(BigDecimal.valueOf(4.3).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1300-0001").productName("PANSETA")
						.price(BigDecimal.valueOf(6.5).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1400-0001").productName("VEGAN MPIFTEKI")
						.price(BigDecimal.valueOf(4.5).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1500-0001").productName("MPIFTEKI")
						.price(BigDecimal.valueOf(5).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1000-0003").productName("KALAMARAKI")
						.price(BigDecimal.valueOf(4.5).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1000-0004").productName("FILETO KOTOPOULO")
						.price(BigDecimal.valueOf(8).doubleValue()).category(newCategory).build());

		var productsCreated = productService.createAll(products);
		logger.info("Created {} products.", productsCreated.size());
		productsCreated.stream()
				.sorted(Comparator.comparing(Product::getId))
				.forEach(p -> logger.debug("{}. {}", p.getId(), p));

		Set<ShippingAddress> addressesSet = new HashSet<>();

		ShippingAddress address1 = ShippingAddress.builder()
				.street("123 Main St")
				.streetNumber("100A")
				.floor("1")
				.bell("Bell1")
				.city("City1")
				.zipCode("10001")
				.specificInstructions("Leave at front door")
				.typeAddress(TypeAddress.HOME)
				.communicationPhoneNumber("123-456-7890")
				.build();

		ShippingAddress address2 = ShippingAddress.builder()
				.street("456 Second St")
				.streetNumber("200B")
				.floor("2")
				.bell("Bell2")
				.city("City2")
				.zipCode("20002")
				.specificInstructions("Leave at back door")
				.typeAddress(TypeAddress.BUSINESS)
				.communicationPhoneNumber("234-567-8901")
				.build();

		addressesSet.add(address1);
		addressesSet.add(address2);

		List<Account> customersCreated = user.createAll(

				Account.builder().email("malcolm.paker@gmailx.com")
						.name("Malcolm").surname("Parker")
						.build(),
				Account.builder().email("terry.jones@gmailx.com")
						.name("Terry").surname("Jones")
						.build()
		);

		int i=0;
		for (ShippingAddress element : addressesSet) {
			customersCreated.get(i).getShippingAddresses().add(element);
			i++;
		}

		logger.info("Created {} customers.", customersCreated.size());
		customersCreated.stream()
				.sorted(Comparator.comparing(Account::getId))
				.forEach(c -> logger.debug("{}. {}", c.getId(), c));
	}
}