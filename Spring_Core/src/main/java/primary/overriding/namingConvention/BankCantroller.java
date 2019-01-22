package primary.overriding.namingConvention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BankCantroller {

	@Autowired
	private Bank bank;

	public void showBankDetails() {

		bank.showBankDetails();
	}

}
