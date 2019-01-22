package qualifier.demo2.namingconvention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PrivateBankCantroller {

	@Autowired
	// @Qualifier(value="PrivateBank")
	private Bank privateBank; // using naming convention instead of Qualifier to resolve issues because of two
								// beans (PublicBank
								// ,PrivateBank) are eligible bank interface.

	public void showBankDetails() {

		privateBank.showBankDetails();
	}

}
