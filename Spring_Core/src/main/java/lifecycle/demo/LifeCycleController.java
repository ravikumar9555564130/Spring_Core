package lifecycle.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value = "lifeCycleController")
public class LifeCycleController {

	Logger logger = LoggerFactory.getLogger(LifeCycleController.class);

	public LifeCycleController() {
		logger.info("bean creration");
	}

	@PostConstruct
	public void intit() {
		logger.info("initialization activities after bean creration");
	}

	@PreDestroy
	public void destroy() {
		logger.info("destruction activities after bean has finished it's task");
	}

	public void display() {

		logger.info("LifeCycleController life cycle method demo");

	}

}
