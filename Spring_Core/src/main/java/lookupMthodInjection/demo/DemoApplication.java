package lookupMthodInjection.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "lookupMthodInjection.demo" })
public class DemoApplication {

	private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		logger.info("================Start========================= ");

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		TicketCollector ticketCollector_1 = applicationContext.getBean("ticketCollector", TicketCollector.class); // same
																													// object
																													// return

		logger.info(
				"My ticket number :: " + ticketCollector_1 + "  :: " + ticketCollector_1.getTicket().getTicketNumber());// different
																														// object
																														// return

		logger.info(
				"My ticket number :: " + ticketCollector_1 + "  :: " + ticketCollector_1.getTicket().getTicketNumber());// different
																														// object
																														// return
		logger.info(
				"My ticket number :: " + ticketCollector_1 + "  :: " + ticketCollector_1.getTicket().getTicketNumber());// different
																														// object
																														// return

		TicketCollector ticketCollector_2 = applicationContext.getBean("ticketCollector", TicketCollector.class); // same
																													// object
																													// return

		logger.info(
				"My ticket number :: " + ticketCollector_2 + "  :: " + ticketCollector_1.getTicket().getTicketNumber());// different
																														// object
																														// return
		logger.info(
				"My ticket number :: " + ticketCollector_2 + "  :: " + ticketCollector_1.getTicket().getTicketNumber());// different
																														// object
																														// return
		logger.info(
				"My ticket number :: " + ticketCollector_2 + "  :: " + ticketCollector_1.getTicket().getTicketNumber());// different
																														// object
																														// return

		logger.info("============================end=================================");

	}

}
