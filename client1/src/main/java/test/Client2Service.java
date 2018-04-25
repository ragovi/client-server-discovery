package test;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Client2Service {

	private final RestTemplate restTemplate;

	public Client2Service(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String getName() {
//		return this.restTemplate.getForObject(String.format("http://client2/name"), String.class);
		return "{\"agreementId\":\"1234\"}";
	}


}
