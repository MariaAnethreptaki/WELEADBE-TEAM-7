package gr.athtech;

import gr.athtech.domain.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EshopApplication {
    public static void main(String[] args) {
        SpringApplication.run(EshopApplication.class, args);
        Account account = new Account();
        System.out.println(account.toString());

    }
}
