package bean.demo.singleton.two.objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeDaoImpl implements EmployeeDao {

	Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Override
	public void save(Employee employee) {

		logger.info("EmployeeDaoImpl saved employee " + employee);

	}

}
