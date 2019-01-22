package primary.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="PublicBank")
@Primary
public class PublicBank implements Bank {

	Logger logger = LoggerFactory.getLogger(PrivateBank.class);

	@Override
	public void showBankDetails() {
		logger.info("PublicBank Info");

	}

}
