package primary.overriding.namingConvention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PublicBankCantroller {

	@Autowired
	//@Qualifier(value = "PublicBank")
	private Bank publicBank; // never use naming convention , because primary always override it.

	public void showBankDetails() {

		publicBank.showBankDetails();
	}

}
