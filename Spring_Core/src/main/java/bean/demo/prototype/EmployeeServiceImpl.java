package bean.demo.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void save(Employee employee) {
		logger.info("EmployeeServiceImpl saved employee " + employee);
		employeeDao.save(employee);

	}

}
