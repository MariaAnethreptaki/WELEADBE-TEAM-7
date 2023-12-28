package main;

import main.domain.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EshopApplication {
	public static void main(String[] args) {
		//SpringApplication.run(EshopApplication.class, args);
		Account account = new Account("Sophia@","6937777777");
		System.out.println(account);

	}
}
