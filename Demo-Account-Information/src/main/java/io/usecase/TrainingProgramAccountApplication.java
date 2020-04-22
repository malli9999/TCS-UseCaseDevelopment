package io.usecase;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import io.usecase.account.DemoAccountModel;
import io.usecase.account.DemoAccountRepository;
import io.usecase.rewards.DemoRewardsModel;
import io.usecase.rewards.DemoRewardsRepository;
import io.usecase.transaction.DemoTransactionModel;
import io.usecase.transaction.DemoTransactionRepository;


@SpringBootApplication
@EnableEurekaClient
public class TrainingProgramAccountApplication {
	
	
	
    @Autowired
    private DemoAccountRepository repository;
    
    @Autowired
    private DemoTransactionRepository transRepo;
    
    @Autowired
    private DemoRewardsRepository rewRepo;
    
    
    @PostConstruct
    public void initUsers() {
        List<DemoAccountModel> users = Stream.of(
                new DemoAccountModel("arjun@gmail.com", 171234234, "Checkings",0101, 9999999,  "USD","Active"),
                new DemoAccountModel("malli@gmail.com", 345463454, "savings",1010, 99989898 , "USD", "Active")

        ).collect(Collectors.toList());
        repository.saveAll(users);
                            }
    
    
    
    @PostConstruct
    public void initTrans() {
        List<DemoTransactionModel> users = Stream.of(
                new DemoTransactionModel("171234234", "03/20/2020",1000,  "USD","POSTED","Active"),
                new DemoTransactionModel("345463454", "03/20/2020",2000, "USD", "PENDING","Active")

        ).collect(Collectors.toList());
        transRepo.saveAll(users);
           }
    

    
    @PostConstruct
    public void initRewards() {
        List<DemoRewardsModel> users = Stream.of(
                new DemoRewardsModel("arjun@gmail.com", 171234234, 500, "ANNUAL", "AVAILABLE","07/10/2020"),
                new DemoRewardsModel("malli@gmail.com", 345463454, 400, "ANNUAL", "UNAVAILABLE","07/12/2020")

        ).collect(Collectors.toList());
        rewRepo.saveAll(users);
        
           }
	
   @LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(TrainingProgramAccountApplication.class, args);
	}

}
