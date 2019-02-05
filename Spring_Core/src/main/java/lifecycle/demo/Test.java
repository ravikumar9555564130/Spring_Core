package lifecycle.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Test {

	Logger logger = LoggerFactory.getLogger(Test.class);

	public void show() {
		
		logger.info("Test ::show ");

	}

}
