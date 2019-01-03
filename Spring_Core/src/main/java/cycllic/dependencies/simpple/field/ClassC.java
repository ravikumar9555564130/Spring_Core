package cycllic.dependencies.simpple.field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ClassC {

	Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	public ClassC() {
		super();
		if (logger.isInfoEnabled()) {
			logger.info("default constructor classC");
		}

	}

	public void showC() {

		if (logger.isInfoEnabled()) {
			logger.info("show mehtos of classC");
		}

	}

}
