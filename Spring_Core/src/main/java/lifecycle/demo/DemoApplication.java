package lifecycle.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "lifecycle.demo" })
public class DemoApplication {

	private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		logger.info("================Start========================= ");

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		LifeCycleController lifeCycleController = applicationContext.getBean("lifeCycleController", LifeCycleController.class);
		lifeCycleController.display();

		logger.info("============================end=================================");

	}

}
