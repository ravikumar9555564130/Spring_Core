package profile.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "dev")
public class DevProfile implements MyProfile {

	Logger logger = LoggerFactory.getLogger(DevProfile.class);

	@Override
	public void runProfile() {

		logger.info("run Dev profile");

	}

}
