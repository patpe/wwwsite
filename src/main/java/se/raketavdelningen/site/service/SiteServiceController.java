package se.raketavdelningen.site.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/siteservice")
public class SiteServiceController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String contactBackendService() {
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject("http://localhost:8181/service", String.class);
		return response;
	}
}
