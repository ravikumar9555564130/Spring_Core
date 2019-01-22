package qualifier.demo2.namingconvention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PrivateBankCantroller {

	@Autowired
	// @Qualifier(value="PrivateBank")
	private Bank privateBank;  //use naming convention instead of qualifier

	public void showBankDetails() {

		privateBank.showBankDetails();
	}

}
