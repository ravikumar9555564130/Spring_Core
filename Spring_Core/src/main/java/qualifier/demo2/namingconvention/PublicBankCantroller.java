package qualifier.demo2.namingconvention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PublicBankCantroller {

	@Autowired
	// @Qualifier(value = "PublicBank")
	private Bank publicBank; // using naming convention instead of Qualifier to resolve issues because of two
								// beans (PublicBank
								// ,PrivateBank) are eligible bank interface.

	// always prefer qualifier over naming convention.

	public void showBankDetails() {

		publicBank.showBankDetails();
	}

}
