package primary.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="PrivateBank")
public class PrivateBank implements Bank{
	
	Logger logger = LoggerFactory.getLogger(PrivateBank.class);

	@Override
	public void showBankDetails() {
		logger.info("PrivateBank Info");
		
	}

}
