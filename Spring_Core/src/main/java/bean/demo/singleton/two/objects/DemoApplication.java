package bean.demo.singleton.two.objects;

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

		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController_1");
		EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService_1");
		EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("employeeDao_1");

		logger.info(" employeeController:: " + employeeController);
		logger.info(" employeeService:: " + employeeService);
		logger.info(" employeeDao:: " + employeeDao);

		employeeController.save(new Employee());
		// calling once again for verifying singleton property with two objects

		employeeController = (EmployeeController) applicationContext.getBean("employeeController_2");
		employeeService = (EmployeeService) applicationContext.getBean("employeeService_2");
		employeeDao = (EmployeeDao) applicationContext.getBean("employeeDao_2");

		logger.info(" employeeController:: " + employeeController);
		logger.info(" employeeService:: " + employeeService);
		logger.info(" employeeDao:: " + employeeDao);

		employeeController.save(new Employee());

		System.out.println("============================end=================================");

	}

}
