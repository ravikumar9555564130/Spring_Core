package cycllic.dependencies.simpple.constructor.sol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

	Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	ClassB classB;

	@Autowired
	public ClassA(@Lazy ClassB classB) {
		super();
		this.classB = classB;
	}

	public void showA() {

		if (logger.isInfoEnabled()) {
			logger.info("show mehtos of classA");
		}

		classB.showB();

	}

}
