package cycllic.dependencies.simpple.setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {

	Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	ClassA classA;

	ClassC classC;

	public ClassB() {
		super();
		if (logger.isInfoEnabled()) {
			logger.info("default constructor classB");
		}

	}

	public void showB() {

		if (logger.isInfoEnabled()) {
			logger.info("show mehtos of classB");
		}

		classC.showC();

	}

	public ClassA getClassA() {
		return classA;
	}

	@Autowired
	public void setClassA(ClassA classA) {
		this.classA = classA;
		if (logger.isInfoEnabled()) {
			logger.info("setClassA in classB");
		}
	}

	public ClassC getClassC() {
		return classC;
	}
	
	
	@Autowired
	public void setClassC(ClassC classC) {
		this.classC = classC;

		if (logger.isInfoEnabled()) {
			logger.info("setClassC in classB");
		}
	}

}
