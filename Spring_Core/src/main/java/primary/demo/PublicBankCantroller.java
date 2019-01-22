package primary.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PublicBankCantroller {

	@Autowired
	@Qualifier(value = "PublicBank")
	private Bank bank;

	public void showBankDetails() {

		bank.showBankDetails();
	}

}
