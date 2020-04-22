package io.usecase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class DemoLogoffApplication {

	@Bean
	  public RestTemplate  getRestTempalte() {
			return new RestTemplate();
		}
	

	public static void main(String[] args) {
		SpringApplication.run(DemoLogoffApplication.class, args);
		
		
		
		
	}

}
