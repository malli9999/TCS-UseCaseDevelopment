package io.usecase;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoLogoffController {

	@Autowired
	private RestTemplate restTemplate;
	
	@DeleteMapping("/bank/user/authentication")
	public LogoffResponse logoffUser(String sessionID) {
		System.out.println("inside log off");
		 //session = RequestContextHolder.currentRequestAttributes().getSessionId();

		HashMap<String, String> params = new HashMap<>();
		params.put("id", sessionID);
		try {
			restTemplate.put("http://demo-database/user/deactiveSession", params);
			return new LogoffResponse("LogoffSuccessfull");
		}
		catch (Exception e) {
			System.out.println(e);
			return new LogoffResponse("Invalid session ID");
		}
		

		
	}
	
}
