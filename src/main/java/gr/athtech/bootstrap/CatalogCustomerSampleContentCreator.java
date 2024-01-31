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
				Product.builder().serialNumber("WRAPS-01").productName("GYROS_KOTOPOULO")
						.price(BigDecimal.valueOf(3.8)).category(wrapsCategory)
						.available(true).description("patates,ntomata,kitrini sauce").build(),
				Product.builder().serialNumber("WRAPS-02").productName("GYROS_XOIRINO")
						.price(BigDecimal.valueOf(3.5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,roz sauce").build(),
				Product.builder().serialNumber("WRAPS-03").productName("GYROS_ANAMEIKTOS")
						.price(BigDecimal.valueOf(3.6) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,tzatziki").build(),
				Product.builder().serialNumber("WRAPS-04").productName("SOUBLAKI_KOTOPOULO")
						.price(BigDecimal.valueOf(4.5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,giaourti").build(),
				Product.builder().serialNumber("WRAPS-05").productName("SOUBLAKI_XOIRINO")
						.price(BigDecimal.valueOf(4.3) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,roz sauce").build(),
				Product.builder().serialNumber("WRAPS-06").productName("PANSETA")
						.price(BigDecimal.valueOf(6.5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,bbq sauce").build(),
				Product.builder().serialNumber("WRAPS-07").productName("VEGAN_MPIFTEKI")
						.price(BigDecimal.valueOf(4.5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,vegan sauce").build(),
				Product.builder().serialNumber("WRAPS-08").productName("MPIFTEKI")
						.price(BigDecimal.valueOf(5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,mayionesa").build(),
				Product.builder().serialNumber("WRAPS-09").productName("KALAMARAKI")
						.price(BigDecimal.valueOf(4.5) ).category(wrapsCategory)
						.available(true).description("patates,ntomata,tzatziki").build(),
				Product.builder().serialNumber("WRAPS-10").productName("FILETO_KOTOPOULO")
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
				Product.builder().serialNumber("SIDES-01").productName("PATATES_TIGANITES")
						.price(BigDecimal.valueOf(3)).category(sidesCategory).available(true).build(),
				Product.builder().serialNumber("SIDES-02").productName("KOLOKITHAKIA_TIGANITA")
						.price(BigDecimal.valueOf(4)).category(sidesCategory).available(true).build(),
				Product.builder().serialNumber("SIDES-03").productName("TZATZIKI")
						.price(BigDecimal.valueOf(3)).category(sidesCategory).available(true).build(),
				Product.builder().serialNumber("SIDES-04").productName("TYROKAYTERI")
						.price(BigDecimal.valueOf(3)).category(sidesCategory).available(true).build());

		List<Product> beverages = List.of(
				Product.builder().serialNumber("BEV-01").productName("COKA-COLA")
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

		Set<Product> wrapsSet = new HashSet<>(wraps);
		wrapsCategory.setProducts(wrapsSet);

		//productCategoryService.update(wrapsCategory);
		Set<Product> saladsSet = new HashSet<>(salads);
		saladsCategory.setProducts(saladsSet);
		//productCategoryService.update(saladsCategory);
		Set<Product> sidesSet = new HashSet<>(sides);
		sidesCategory.setProducts(sidesSet);
		//productCategoryService.update(sidesCategory);
		Set<Product> beveragesSet = new HashSet<>(beverages);
		beveragesCategory.setProducts(beveragesSet);
		//productCategoryService.update(beveragesCategory);

		List<Account> accountsCreated = user.createAll(

				Account.builder().email("malcolm.paker@gmailx.com")
						.name("Malcolm").surname("Parker").password("Ans2024@%$%").phoneNumber("6946464646")
						.build(),
				Account.builder().email("terry.jones@gmailx.com")
						.name("Terry").surname("Jones").password("Ans2024@%$%").phoneNumber("69898989898")
						.build(),
				Account.builder().email("maria.aneth@gmailx.com")
						.name("Maria").surname("Anethreptaki").password("Ans2024@%$%").phoneNumber("69797979797")
						.build(),
				Account.builder().email("poulaki@gmail.com")
						.name("Anna").surname("Poulaki").password("Ans2024@%$%").phoneNumber("6949191491")
						.build(),
				Account.builder().email("pateraki@gmail.com")
						.name("Alex").surname("Pateraki").password("Ans2024@%$%").phoneNumber("6941291491")
						.build(),
				Account.builder().email("maria.21@gmil.com")
						.name("Maria").surname("aberaki").password("Ans2024@%$%").phoneNumber("6949194561")
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

		Store store =storeService.create(Store.builder().storeName("BEST_SOUVLAKI").storeLocation("heraklion").rate(5).status(true).storeCategory(storeCategory).build());
		Set<ProductCategory> categories = new HashSet<>();
		categories.add(wrapsCategory);
		categories.add(sidesCategory);
		categories.add(saladsCategory);
		categories.add(beveragesCategory);
		store.setMenu(categories);
		storeService.update(store);


		ProductCategory pizzaCategory = productCategoryService.create(ProductCategory.builder().productCategoryName("PIZZA").build());
		logger.info("Created {}.", pizzaCategory);
		ProductCategory pizzaSidesCategory = productCategoryService.create(ProductCategory.builder().productCategoryName("OREKTIKA-PIZZA").build());
		logger.info("Created {}.", sidesCategory);


		List<Product> pizza = List.of(
				Product.builder().serialNumber("PIZZA-01").productName("SPECIAL")
						.price(BigDecimal.valueOf(9.20)).category(pizzaCategory)
						.available(true).description("cheese,ham,onion,tomato,mushrooms").build(),
				Product.builder().serialNumber("PIZZA-02").productName("BBQ")
						.price(BigDecimal.valueOf(8.5) ).category(pizzaCategory)
						.available(true).description("cheese,ham,bbq_sauce").build(),
				Product.builder().serialNumber("PIZZA-03").productName("ITALIAN")
						.price(BigDecimal.valueOf(8.9) ).category(pizzaCategory)
						.available(true).description("tomato,ham,cheese").build(),
				Product.builder().serialNumber("PIZZA-04").productName("PEPERONI")
						.price(BigDecimal.valueOf(9.5) ).category(pizzaCategory)
						.available(true).description("mozzarella,peperoni,tomato").build(),
				Product.builder().serialNumber("PIZZA-05").productName("APLI")
						.price(BigDecimal.valueOf(6.9) ).category(pizzaCategory)
						.available(true).description("ham, mozzarella,ntomata").build(),
				Product.builder().serialNumber("PIZZA-06").productName("ELLINIKH")
						.price(BigDecimal.valueOf(8.5) ).category(pizzaCategory)
						.available(true).description("ham, feta, olives").build(),
				Product.builder().serialNumber("PIZZA-07").productName("VEGAN")
						.price(BigDecimal.valueOf(7.5) ).category(pizzaCategory)
						.available(true).description("manitaria,ntomata,piperies,vegan sauce").build(),
				Product.builder().serialNumber("PIZZA-08").productName("4TYRIA")
						.price(BigDecimal.valueOf(7.10) ).category(pizzaCategory)
						.available(true).description("rokfor, mozzarela, feta, kefalotyri").build(),
				Product.builder().serialNumber("PIZZA-09").productName("EXOTIC")
						.price(BigDecimal.valueOf(7.9) ).category(pizzaCategory)
						.available(true).description("pineappe,ntomata,ham").build(),
				Product.builder().serialNumber("PIZZA-10").productName("NUGGETS")
						.price(BigDecimal.valueOf(8.9) ).category(pizzaCategory)
						.available(true).description("nuggets,ntomata,kitrini sauce").build());


		List<Product> pizzaSides = List.of(
				Product.builder().serialNumber("PIZZASIDES-01").productName("ONION_RINGS")
						.price(BigDecimal.valueOf(4)).category(pizzaSidesCategory).available(true).build(),
				Product.builder().serialNumber("PIZZASIDES-02").productName("COUNTRY_POTATES")
						.price(BigDecimal.valueOf(4)).category(pizzaSidesCategory).available(true).build(),
				Product.builder().serialNumber("PIZZASIDES-03").productName("MOZZARELA_STICKS")
						.price(BigDecimal.valueOf(3)).category(pizzaSidesCategory).available(true).build(),
				Product.builder().serialNumber("PIZZASIDES-04").productName("PATZARIA")
						.price(BigDecimal.valueOf(3)).category(pizzaSidesCategory).available(true).build());


		var pizzasCreated = productService.createAll(pizza);
		logger.info("Created {} pizzas.", pizzasCreated.size());


		var pizzaSidesCreated = productService.createAll(pizzaSides);
		logger.info("Created {} pizzaSides.", pizzaSidesCreated.size());



		StoreCategory pizzaStoreCategory = storeCategoryService.create(StoreCategory.builder().storeCategoryName("PIZZA").description("I kaliteri pizza tis athinas").build());
		logger.info("Created {}.", pizzaStoreCategory);

		Set<Product> pizzaSet = new HashSet<>(pizza);
		pizzaCategory.setProducts(pizzaSet);

		//productCategoryService.update(pizzaCategory);

		Set<Product> pizzaSidesSet = new HashSet<>(pizzaSides);
		pizzaSidesCategory.setProducts(pizzaSidesSet);

		//productCategoryService.update(pizzaSidesCategory);

		Store pizzaStore =storeService.create(Store.builder().storeName("BEST_PIZZA").storeLocation("athens").rate(5).status(true).storeCategory(pizzaStoreCategory).build());
		Set<ProductCategory> pizzaCategories = new HashSet<>();
		categories.add(pizzaCategory);
		categories.add(pizzaSidesCategory);
		categories.add(saladsCategory);
		categories.add(beveragesCategory);
		pizzaStore.setMenu(pizzaCategories);
		storeService.update(pizzaStore);

		ProductCategory burgerCategory = productCategoryService.create(ProductCategory.builder().productCategoryName("BURGER").build());
		logger.info("Created {}.", burgerCategory);
		ProductCategory burgerSidesCategory = productCategoryService.create(ProductCategory.builder().productCategoryName("OREKTIKA-BURGER").build());
		logger.info("Created {}.", burgerSidesCategory);


		List<Product> burger = List.of(
				Product.builder().serialNumber("BURGER-01").productName("HAMBURGER")
						.price(BigDecimal.valueOf(10.20)).category(burgerCategory)
						.available(true).description("cheese, beef, onions, tomato").build(),
				Product.builder().serialNumber("BURGER-02").productName("CHEESEBURGER")
						.price(BigDecimal.valueOf(11.5) ).category(burgerCategory)
						.available(true).description("cheese, beef, pickled relish, house sauch").build(),
				Product.builder().serialNumber("BURGER-03").productName("BACON BURGER")
						.price(BigDecimal.valueOf(10.9) ).category(burgerCategory)
						.available(true).description("tomato, beef, cheese, onions, house sauce").build(),
				Product.builder().serialNumber("BURGER-04").productName("SMOKEY BBQ")
						.price(BigDecimal.valueOf(12.5) ).category(burgerCategory)
						.available(true).description("bbq sauce, bacon, pickled relish, tomato").build(),
				Product.builder().serialNumber("BURGER-05").productName("MEXICAN")
						.price(BigDecimal.valueOf(12.9) ).category(burgerCategory)
						.available(true).description("onions, beef, cheddar, egg").build(),
				Product.builder().serialNumber("BURGER-06").productName("CHICKEN")
						.price(BigDecimal.valueOf(9.5) ).category(burgerCategory)
						.available(true).description("parmesan, onions, caesar's sauce").build(),
				Product.builder().serialNumber("BURGER-07").productName("VEGGIE")
						.price(BigDecimal.valueOf(9.5) ).category(burgerCategory)
						.available(true).description("onions, iceberg,ntomata,vegan sauce").build());



				List<Product> burgerSides = List.of(
						Product.builder().serialNumber("BURGERSIDES-01").productName("XL-ONION-RINGS")
								.price(BigDecimal.valueOf(4.3)).category(burgerSidesCategory).available(true).build(),
						Product.builder().serialNumber("BURGERSIDES-02").productName("COUNTRY-CRISPY-PATATES")
								.price(BigDecimal.valueOf(4.2)).category(burgerSidesCategory).available(true).build(),
						Product.builder().serialNumber("BURGERSIDES-03").productName("MOZZARELLA-STICKS")
								.price(BigDecimal.valueOf(3.1)).category(burgerSidesCategory).available(true).build(),
						Product.builder().serialNumber("BURGERSIDES-04").productName("CHICKEN-NUGGETS")
								.price(BigDecimal.valueOf(3.5)).category(burgerSidesCategory).available(true).build());


		var burgerCreated = productService.createAll(burger);
		logger.info("Created {} pizzas.", burgerCreated.size());


		var burgerSidesCreated = productService.createAll(burgerSides);
		logger.info("Created {} burgerSides.", burgerSidesCreated.size());



		StoreCategory burgerStoreCategory = storeCategoryService.create(StoreCategory.builder().storeCategoryName("burger").description("TO ZOUMERO BURGER").build());
		logger.info("Created {}.", burgerStoreCategory);

		Store burgerStore =storeService.create(Store.builder().storeName("BEST_BURGER").storeLocation("athens").rate(5).status(true).storeCategory(burgerStoreCategory).build());
		Set<ProductCategory> burgerCategories = new HashSet<>();
		burgerCategories.add(burgerCategory);
		burgerCategories.add(burgerSidesCategory);
		burgerCategories.add(saladsCategory);
		burgerCategories.add(beveragesCategory);
		burgerStore.setMenu(burgerCategories);
		storeService.update(burgerStore);






	}

}