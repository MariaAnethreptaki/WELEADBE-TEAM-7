package gr.athtech;

import gr.athtech.domain.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EshopApplication {
    public static void main(String[] args) {
        SpringApplication.run(EshopApplication.class, args);

        var customer = new Account();
        customer.setEmail("some@gmailx.com");

        var customerViaBuilder = Account.builder().surname("Someone").name("Me").build();

    }
}
