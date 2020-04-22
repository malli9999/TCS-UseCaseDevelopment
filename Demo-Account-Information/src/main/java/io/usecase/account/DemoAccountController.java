package io.usecase.account;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import io.usecase.rewards.DemoRewardsModel;



@RestController
public class DemoAccountController {

	@Autowired
	private DemoAccountService demoService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DemoAccountRepository accountRepository;
	
	
	@GetMapping("/account/products")
	public List<DemoAccountModel> findAllProducts(){
		return demoService.getServiceDetails();
	}
	

	@PostMapping("/bank/user/dashboard/accountInfo")
	public List<DemoAccountModel> addProducts(@RequestBody List<DemoAccountModel> details) {
		return demoService.saveProducts(details);
  }
	
	
	
//	@DeleteMapping("rewards/delete/{id}")
//	public String deleteProduct(@PathVariable int RewardsAccountID) {
//		return demoService.deleteProduct(RewardsAccountID);
//	}
	
//	public List<CatalogItem> getCatalog (String userId){
//		
		//Movie movie = restTemplate.getForObject("http://localhost:8081/movies/foo", Movie.class);
		
		//get all rated movie id 
//		List<Rating> ratings =  Arrays.asList(	
//			new Rating("1234" , 4),  
//			new Rating("4567" , 5)
//				);
		
//		UserRating ratings = restTemplate.getForObject("http://MOVIE-DATA-SERVICE/ratingdata/users/" + userId, UserRating.class);
//		
//		return ratings.getUserRating().stream().map(rating -> { 
//	    // for each rated movie id . call movie info service and get details 
//		Movie movie =	restTemplate.getForObject("http://MOVIE-INFO-SERVICE/movies/" + rating.getMovieId(), Movie.class);
//		//put them all together
//		return new CatalogItem(movie.getName() , "Test",  rating.getRating());
//		})
//		.collect(Collectors.toList());		
//	}

	@GetMapping("/acc/{username}")
	public Optional<DemoAccountModel> show(@PathVariable("username") String username){
		
		return accountRepository.findById(username);
		
	}

	
	
	
}
	