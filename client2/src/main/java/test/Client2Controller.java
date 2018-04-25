package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client2Controller {

	private static final Logger LOG = LoggerFactory.getLogger(Client2Controller.class);

	private final String hostName = System.getenv("HOSTNAME");

	@RequestMapping("/")
	public String ribbonPing() {
		LOG.info("Ribbon ping");
		return this.hostName;
	}

	@RequestMapping("/name")
	public String getName() {
		LOG.info(String.format("Returning a name '%s' ", this.hostName));
		return this.hostName;
	}

}