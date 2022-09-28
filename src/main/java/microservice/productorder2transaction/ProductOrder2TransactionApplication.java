package microservice.productorder2transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class ProductOrder2TransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductOrder2TransactionApplication.class, args);


	}


}
