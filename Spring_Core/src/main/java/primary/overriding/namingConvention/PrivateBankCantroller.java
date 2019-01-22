package primary.overriding.namingConvention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PrivateBankCantroller {

	@Autowired
	// @Qualifier(value="PrivateBank")
	private Bank privateBank; // never use naming convention , because primary always override it.

	public void showBankDetails() {

		privateBank.showBankDetails();
	}

}
