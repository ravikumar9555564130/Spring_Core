package cycllic.dependencies.simpple.constructor.sol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "cycllic.dependencies.simpple.constructor.sol" })
public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Test.class, args);
		ClassA classA = context.getBean(ClassA.class);
		
		System.out.println("classA :: " +classA);
		classA.showA();
		
      
	}
}
