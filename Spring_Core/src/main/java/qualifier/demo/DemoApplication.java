package qualifier.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "qualifier.demo" })
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("================Start========================= ");

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		PrivateBankCantroller privateBankCantroller = applicationContext.getBean(PrivateBankCantroller.class);

		privateBankCantroller.showBankDetails();

		PublicBankCantroller publicBankCantroller = applicationContext.getBean(PublicBankCantroller.class);

		publicBankCantroller.showBankDetails();

		System.out.println("============================end=================================");

	}

}
