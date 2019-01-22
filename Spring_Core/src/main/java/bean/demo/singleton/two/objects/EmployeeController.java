package bean.demo.singleton.two.objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeController {

	@Autowired
	@Qualifier(value="employeeService_1")
	private EmployeeService employeeService;

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	public void save(Employee employee) {
		logger.info("EmployeeController saved employee " + employee);
		employeeService.save(employee);

	}

}
