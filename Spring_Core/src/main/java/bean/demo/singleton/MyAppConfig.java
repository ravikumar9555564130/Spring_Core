package bean.demo.singleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyAppConfig {

	@Bean(name = "employeeController")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public EmployeeController getEmployeeController() {
		return new EmployeeController();
	}

	@Bean(name = "employeeService")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl();
	}

	@Bean(name = "employeeDao")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public EmployeeDao getEmployeeDao() {
		return new EmployeeDaoImpl();
	}

}
