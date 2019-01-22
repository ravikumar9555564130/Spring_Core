package bean.demo.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	public void save(Employee employee) {
		logger.info("EmployeeController saved employee " + employee);
		employeeService.save(employee);

	}

}
