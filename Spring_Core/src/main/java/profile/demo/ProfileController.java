package profile.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {

	@Autowired
	private MyProfile myProfile;

	public void runProfile() {
		myProfile.runProfile();
	}

}
