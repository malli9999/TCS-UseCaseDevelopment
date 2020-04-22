package io.usecase;

import org.hibernate.annotations.Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import io.usecase.entity.User;
import io.usecase.repository.UserRepository;
import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class TrainingProgram3Application{
	
	@LoadBalanced
	@Bean
    public RestTemplate  getRestTempalte() {
		return new RestTemplate();
	}
	
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User("arjun@gmail.com", "arjun", "malli@gmail.com",new Date() , "tier-1",  "ACTIVE"),
                new User("malli@gmail.com", "malli", "arjun@gmail.com",new Date(), "tier-1" , "ACTIVE")

        ).collect(Collectors.toList());
        repository.saveAll(users);
        
        
    }

    
    public static void main(String[] args) {
        SpringApplication.run(TrainingProgram3Application.class, args);
    }

}