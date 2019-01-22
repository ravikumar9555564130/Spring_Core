package bean.demo.singleton.two.objects;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyAppConfig {

	@Bean(name = "employeeController_1")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public EmployeeController getEmployeeController_1() {
		return new EmployeeController();
	}

	@Bean(name = "employeeService_1")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public EmployeeService getEmployeeService_1() {
		return new EmployeeServiceImpl();
	}

	@Bean(name = "employeeDao_1")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public EmployeeDao getEmployeeDao_1() {
		return new EmployeeDaoImpl();
	}
	
	@Bean(name = "employeeController_2")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public EmployeeController getEmployeeController_2() {
		return new EmployeeController();
	}

	@Bean(name = "employeeService_2")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public EmployeeService getEmployeeService_2() {
		return new EmployeeServiceImpl();
	}

	@Bean(name = "employeeDao_2")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public EmployeeDao getEmployeeDao_2() {
		return new EmployeeDaoImpl();
	}

}
