package bean.demo.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	static Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	public static void main(String[] args) {

		System.out.println("================Start========================================== ");

		ApplicationContext applicationContext = SpringApplication.run(MyAppConfig.class, args);

		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService");
		EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("employeeDao");

		logger.info(" employeeController:: " + employeeController);
		logger.info(" employeeService:: " + employeeService);
		logger.info(" employeeDao:: " + employeeDao);

		employeeController.save(new Employee());

		// calling once again for verifying prototype property

		employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		employeeService = (EmployeeService) applicationContext.getBean("employeeService");
		employeeDao = (EmployeeDao) applicationContext.getBean("employeeDao");

		logger.info(" employeeController:: " + employeeController);
		logger.info(" employeeService:: " + employeeService);
		logger.info(" employeeDao:: " + employeeDao);

		employeeController.save(new Employee());

		System.out.println("============================end=================================");

	}

}
