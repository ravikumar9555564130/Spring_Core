package profile.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "profile.demo" })
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("================Start========================= ");

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		ProfileController profileController = applicationContext.getBean(ProfileController.class);
		profileController.runProfile();

		System.out.println("============================end=================================");

	}

}
