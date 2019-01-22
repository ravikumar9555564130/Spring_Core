package profile.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = { "def", "default" }) // default profile is active if only if ,there is not other profile is active.
public class DefaultProfile implements MyProfile {

	Logger logger = LoggerFactory.getLogger(DefaultProfile.class);

	@Override
	public void runProfile() {

		logger.info("run DefaultProfile profile");

	}

}
