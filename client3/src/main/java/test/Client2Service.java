package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Client2Service {

	private final RestTemplate restTemplate;
	
	@Value("${CLIENT2_SERVICE_PORT}")
	private String client2Port;

	public Client2Service(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String getName() {
		String url = "http://client2:"+client2Port+"/name";
		return this.restTemplate.getForObject(String.format(url), String.class);
	}


}
