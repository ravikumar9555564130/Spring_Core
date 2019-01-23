package lookupMthodInjection.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "ticket")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Ticket {

	Logger logger = LoggerFactory.getLogger(Ticket.class);

	static int ticketId = 0;

	Ticket() {
		logger.info("My ticket number is :: " + ticketId);
	}

	public int getTicketNumber() {
		return ++ticketId;

	}
}
