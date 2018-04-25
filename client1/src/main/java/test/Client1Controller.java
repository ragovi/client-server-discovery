package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1Controller {

	private final Client2Service client2Service;

	public Client1Controller(Client2Service nameService) {
		this.client2Service = nameService;
	}

	@RequestMapping("/client2")
	public String getClient2() {
		return String.format("Hello from %s!", this.client2Service.getName());
	}

}
