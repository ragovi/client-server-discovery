package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client2Controller {

	private static final Logger LOG = LoggerFactory.getLogger(Client2Controller.class);

	private String hostName = null;
	
	public Client2Controller() {
		try {
			hostName = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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