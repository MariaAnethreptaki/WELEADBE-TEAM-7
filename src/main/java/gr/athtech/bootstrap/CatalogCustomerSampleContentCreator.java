package gr.athtech.bootstrap;

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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static gr.athtech.domain.enumPackage.TypeAddress.HOME;

@Component
@Profile("generate-catalog-customers")
@RequiredArgsConstructor
public class CatalogCustomerSampleContentCreator extends BaseComponent implements CommandLineRunner {
	private final ProductService productService;
	private final ProductCategoryService productCategoryService;
	private final AccountService user;
	private final ShippingAddress address;

	@Override
	public void run(String... args) throws Exception {
		ProductCategory newCategory = productCategoryService.create(ProductCategory.builder().productCategoryName("Mobile Phones").build());
		logger.info("Created {}.", newCategory);

		List<Product> products = List.of(
				Product.builder().serialNumber("SN1000-0001").productName("Apple iPhone 12 Pro 5G 512GB")
					   .price(BigDecimal.valueOf(1629).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1000-0002").productName("Apple iPhone 12 Pro Max 5G 512GB")
					   .price(BigDecimal.valueOf(1749).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1100-0001").productName("Samsung Galaxy S21 Ultra")
					   .price(BigDecimal.valueOf(1479.99).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1100-0002").productName("Samsung Galaxy S20 Ultra")
					   .price(BigDecimal.valueOf(1199).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1200-0001").productName("Huawei P40 Pro")
					   .price(BigDecimal.valueOf(899.49).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1300-0001").productName("Xiaomi Redmi 9A")
					   .price(BigDecimal.valueOf(199.75).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1400-0001").productName("RealMe C11")
					   .price(BigDecimal.valueOf(129).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1500-0001").productName("Honor 10 Lite")
					   .price(BigDecimal.valueOf(179).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1000-0003").productName("Apple iPhone 12 Pro Max 5G 128GB")
					   .price(BigDecimal.valueOf(1339).doubleValue()).category(newCategory).build(),
				Product.builder().serialNumber("SN1000-0004").productName("Apple iPhone 11 Pro 256GB")
					   .price(BigDecimal.valueOf(1299.99).doubleValue()).category(newCategory).build());

		var productsCreated = productService.createAll(products);
		logger.info("Created {} products.", productsCreated.size());
		productsCreated.stream()
					   .sorted(Comparator.comparing(Product::getId))
					   .forEach(p -> logger.debug("{}. {}", p.getId(), p));
		//List<ShippingAddress> addresses=address.createAll(
		//		ShippingAddress.builder().typeAddress(HOME).bell("1").floor("1").
			//			street("Tennessee Avenue").streetNumber("3583"));
		List<ShippingAddress> addresses=new ArrayList<ShippingAddress>();
		List<Account> customersCreated = user.createAll(
				Account.builder().email("c.giannacoulis@codehub.gr")
						.name("Constantinos").surname("Giannacoulis").shippingAddresses(addresses).build(),
				Account.builder().email("john.porter@gmailx.com")
						.name("John").surname("Porter").shippingAddresses("2955 Blackwell Street").build(),
				Account.builder().email("malcolm.paker@gmailx.com")
						.name("Malcolm").surname("Parker")
						.address("4071 Kelly Drive").build(),
				Account.builder().email("terry.jones@gmailx.com")
						.name("Terry").surname("Jones")
						.address("3849 Hinkle Lake Road").build(),
				Account.builder().email("peter.mercury@outlookx.com")
						.name("Peter").surname("Mercury")
						.address("Freddie Street 28th").build(),
				Account.builder().email("magdalene.ferguson@gmailx.com")
						.name("Magdalene").surname("Ferguson")
						.address("Jelly Avenue 73").build(),
				Account.builder().email("jones.pirves@gmailx.com")
						.name("Jones").surname("Pirves")
						.address("3rd Mountain Hike, 3").build(),
				Account.builder().email("michael.anderson@gmailx.com")
						.name("Michael").surname("Anderson")
						.address("Hollywood Street 63").build(),
				Account.builder().email("yennefer.lawrance@windowslivex.com")
						.name("Yennefer").surname("Lawrance")
						.address("Rivia 43").build(),
				Account.builder().email("mary.ferry@windowslivex.com")
						.name("Mary").surname("Ferry")
						.address("Downtown 17, California").build();

		logger.info("Created {} customers.", customersCreated.size());
		customersCreated.stream()
						.sorted(Comparator.comparing(Account::getId))
						.forEach(c -> logger.debug("{}. {}", c.getId(), c));
	}
}