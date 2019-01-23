package lookupMthodInjection.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "ticketCollector")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TicketCollector {

	Logger logger = LoggerFactory.getLogger(Ticket.class);

	@Autowired
	private Ticket ticket;

	public int getTicketNumber() {

		logger.info("TicketCollector start ticket collection");

		return ticket.getTicketNumber();

	}

	@Lookup
	public Ticket getTicket() {
		return null;
	}



}
