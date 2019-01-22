package qualifier.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PrivateBankCantroller {

	@Autowired
	@Qualifier(value = "PrivateBank") // using Qualifier to resolve issues because of two beans (PublicBank
									    // ,PrivateBank) are eligible bank interface.
	private Bank bank;

	public void showBankDetails() {

		bank.showBankDetails();
	}

}
