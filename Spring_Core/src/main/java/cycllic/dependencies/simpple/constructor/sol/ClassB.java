package cycllic.dependencies.simpple.constructor.sol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {

	Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	ClassC classC;

	ClassA classA;

	@Autowired
	public ClassB(ClassC classC,ClassA classA) {
		super();
		this.classC = classC;
		this.classA = classA;
	}

	public void showB() {

		if (logger.isInfoEnabled()) {
			logger.info("show mehtos of classB");
		}

		classC.showC();

	}

}
