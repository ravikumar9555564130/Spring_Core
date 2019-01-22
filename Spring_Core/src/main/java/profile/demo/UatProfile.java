package profile.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value="uat")
public class UatProfile implements MyProfile {

	Logger logger = LoggerFactory.getLogger(UatProfile.class);

	@Override
	public void runProfile() {
		
		logger.info("run UAT profile");

	}


}
