package gr.athtech.bootstrap;

import gr.athtech.domain.*;
import gr.athtech.domain.enumPackage.TypeAddress;
import gr.athtech.service.*;
import lombok.RequiredArgsConstructor;
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



	private final StoreService storeService;
	private final ProductCategoryService productCategoryService;

	private final StoreCategoryService storeCategoryService;
	private final AccountService user;

	@Override
	public void run(String... args) throws Exception {
		ProductCategory wrapsCategory = productCategoryService.create(ProductCategory.builder().productCategoryName("TYLIXTA").build());
		logger.info("Created {}.", wrapsCategory);
		ProductCategory saladsCategory = productCategoryService.create(ProductCategory.builder().productCategoryName("SALATES").build());
		logger.info("Created {}.", saladsCategory);
		ProductCategory sidesCategory = productCategoryService.create(ProductCategory.builder().productCategoryName("OREKTIKA").build());
		logger.info("Created {}.", sidesCategory);
		ProductCategory beveragesCategory = productCategoryService.create(ProductCategory.builder().productCategoryName("ANAPSYKTIKA").build());
		logger.info("Created {}.", beveragesCategory);

		List<Product> wraps = List.of(
				Product.builder().serialNumber("WRAPS-01").productName("GYROS KOTOPOULO")
						.price(BigDecimal.valueOf(3.8)).category(wrapsCategory)
						.available(true).description("patates,ntomata,kitrini sauce").build(),
				Product.builder().serialNumber("WRAPS-02").productName("GYROS XOIRINO")
						.price(BigDecimal.valueOf(3.5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,roz sauce").build(),
				Product.builder().serialNumber("WRAPS-03").productName("GYROS ANAMEIKTOS")
						.price(BigDecimal.valueOf(3.6) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,tzatziki").build(),
				Product.builder().serialNumber("WRAPS-04").productName("SOUBLAKI KOTOPOULO")
						.price(BigDecimal.valueOf(4.5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,giaourti").build(),
				Product.builder().serialNumber("WRAPS-05").productName("SOUBLAKI XOIRINO")
						.price(BigDecimal.valueOf(4.3) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,roz sauce").build(),
				Product.builder().serialNumber("WRAPS-06").productName("PANSETA")
						.price(BigDecimal.valueOf(6.5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,bbq sauce").build(),
				Product.builder().serialNumber("WRAPS-07").productName("VEGAN MPIFTEKI")
						.price(BigDecimal.valueOf(4.5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,vegan sauce").build(),
				Product.builder().serialNumber("WRAPS-08").productName("MPIFTEKI")
						.price(BigDecimal.valueOf(5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,mayionesa").build(),
				Product.builder().serialNumber("WRAPS-09").productName("KALAMARAKI")
						.price(BigDecimal.valueOf(4.5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,tzatziki").build(),
				Product.builder().serialNumber("WRAPS-10").productName("FILETO KOTOPOULO")
						.price(BigDecimal.valueOf(8) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,kitrini sauce").build());

		List<Product> salads = List.of(
				Product.builder().serialNumber("SALADS-01").productName("MAROULI")
						.price(BigDecimal.valueOf(3)).category(saladsCategory)
						.available(true).description("marouli,anitho").build(),
				Product.builder().serialNumber("SALADS-02").productName("XWRIATIKI")
						.price(BigDecimal.valueOf(5)).category(saladsCategory)
						.available(true).description("ntomata,aggouri,piperia,feta,elies").build(),
				Product.builder().serialNumber("SALADS-03").productName("KAISARA")
						.price(BigDecimal.valueOf(6)).category(saladsCategory)
						.available(true).description("marouli,parmezana,crouton,kalampoki,ceasar's sauce").build(),
				Product.builder().serialNumber("SALADS-04").productName("EPOXIS")
						.price(BigDecimal.valueOf(6)).category(saladsCategory)
						.available(true).description("laxano aspro,laxano mwv,karoto").build());

		List<Product> sides = List.of(
				Product.builder().serialNumber("SIDES-01").productName("PATATES TIGANITES")
						.price(BigDecimal.valueOf(3)).category(sidesCategory).available(true).build(),
				Product.builder().serialNumber("SIDES-02").productName("KOLOKITHAKIA TIGANITA")
						.price(BigDecimal.valueOf(4)).category(sidesCategory).available(true).build(),
				Product.builder().serialNumber("SIDES-03").productName("TZATZIKI")
						.price(BigDecimal.valueOf(3)).category(sidesCategory).available(true).build(),
				Product.builder().serialNumber("SIDES-04").productName("TYROKAYTERI")
						.price(BigDecimal.valueOf(3)).category(sidesCategory).available(true).build());

		List<Product> beverages = List.of(
				Product.builder().serialNumber("BEV-01").productName("COKA COLA")
						.price(BigDecimal.valueOf(1.5)).category(beveragesCategory).available(true).build(),
				Product.builder().serialNumber("BEV-02").productName("SPRITE")
						.price(BigDecimal.valueOf(1.5)).category(beveragesCategory).available(true).build(),
				Product.builder().serialNumber("BEV-03").productName("NERO")
						.price(BigDecimal.valueOf(0.5)).category(beveragesCategory).available(true).build(),
				Product.builder().serialNumber("BEV-04").productName("MPYRA")
						.price(BigDecimal.valueOf(2.5)).category(beveragesCategory).available(true).build());


		var wrapsCreated = productService.createAll(wraps);
		logger.info("Created {} wraps.", wrapsCreated.size());

		var saladsCreated = productService.createAll(salads);
		logger.info("Created {} salads.", saladsCreated.size());

		var sidesCreated = productService.createAll(sides);
		logger.info("Created {} sides.", sidesCreated.size());

		var beveragesCreated = productService.createAll(beverages);
		logger.info("Created {} wraps.", beveragesCreated.size());



		List<Account> accountsCreated = user.createAll(

				Account.builder().email("malcolm.paker@gmailx.com")
						.name("Malcolm").surname("Parker").password("jjjjjjjjjjjj").phoneNumber("6946464646")
						.build(),
				Account.builder().email("terry.jones@gmailx.com")
						.name("Terry").surname("Jones").password("jjjjjjjjjjjj").phoneNumber("69898989898")
						.build(),
				Account.builder().email("maria.aneth@gmailx.com")
						.name("Maria").surname("Anethreptaki").password("jjjjjjjjjjjj").phoneNumber("69797979797")
						.build()
		);

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
				.account(accountsCreated.get(1))
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
				.account(accountsCreated.get(0))
				.build();

		addressesSet.add(address1);
		addressesSet.add(address2);
		accountsCreated.get(0).setShippingAddresses(addressesSet);
		user.update(accountsCreated.get(0));


		logger.info("Created {} customers.", accountsCreated.size());
		accountsCreated.stream()
				.sorted(Comparator.comparing(Account::getId))
				.forEach(c -> logger.debug("{}. {}", c.getId(), c));

		StoreCategory storeCategory = storeCategoryService.create(StoreCategory.builder().storeCategoryName("SOUVLAKIA").description("to kalytero souvlaki tis elladas").build());
		logger.info("Created {}.", storeCategory);

		Store store =storeService.create(Store.builder().storeName("BEST SOUVLAKI").storeLocation("heraklion").rate(5).status(true).storeCategory(storeCategory).build());
		Set<ProductCategory> categories = new HashSet<>();
		categories.add(wrapsCategory);
		categories.add(sidesCategory);
		categories.add(saladsCategory);
		categories.add(beveragesCategory);
		store.setMenu(categories);
		storeService.update(store);

	}
}