package cycllic.dependencies.simpple.constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ClassC {

	Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	public void showC() {

		if (logger.isInfoEnabled()) {
			logger.info("show mehtos of classC");
		}

	}

}
