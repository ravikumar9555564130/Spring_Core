package profile.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value="prod")
public class ProdProfile implements MyProfile {

	Logger logger = LoggerFactory.getLogger(ProdProfile.class);

	@Override
	public void runProfile() {
		
		logger.info("run Prod profile");

	}
}
