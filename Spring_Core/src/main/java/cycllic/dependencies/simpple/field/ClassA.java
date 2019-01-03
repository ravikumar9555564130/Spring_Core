package cycllic.dependencies.simpple.field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {


	Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	
	@Autowired
	ClassB classB;

	public ClassA() {
		super();
		if (logger.isInfoEnabled()) {
			logger.info("default constructor classA");
		}

	}

	public void showA() {

		if (logger.isInfoEnabled()) {
			logger.info("show mehtos of classA");
		}

		classB.showB();

	}

	public ClassB getClassB() {
		return classB;
	}

	public void setClassB(ClassB classB) {
		this.classB = classB;
		
		if (logger.isInfoEnabled()) {
			logger.info("setClassB in classA");
		}
	}

}
