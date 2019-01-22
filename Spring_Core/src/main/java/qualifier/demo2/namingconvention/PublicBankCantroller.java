package qualifier.demo2.namingconvention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PublicBankCantroller {

	@Autowired
	// @Qualifier(value = "PublicBank")
	private Bank publicBank;  //use naming convention instead of qualifier

	public void showBankDetails() {

		publicBank.showBankDetails();
	}

}
