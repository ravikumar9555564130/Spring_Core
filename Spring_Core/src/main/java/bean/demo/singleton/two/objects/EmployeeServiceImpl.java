package bean.demo.singleton.two.objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeServiceImpl implements EmployeeService {

	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	@Qualifier(value="employeeDao_2")
	private EmployeeDao employeeDao;

	@Override
	public void save(Employee employee) {
		logger.info("EmployeeServiceImpl saved employee " + employee);
		employeeDao.save(employee);

	}

}
