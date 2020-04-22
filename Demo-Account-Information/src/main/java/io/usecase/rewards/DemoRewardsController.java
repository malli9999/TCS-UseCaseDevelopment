package io.usecase.rewards;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.usecase.transaction.DemoTransactionModel;
import io.usecase.transaction.DemoTransactionRepository;

@RestController
public class DemoRewardsController {

	@Autowired
	private DemoRewardsService rewardsService; 
	
	@Autowired 
	private DemoRewardsRepository rewRepo;
	
	
	@GetMapping("rewards/products")
	public List<DemoRewardsModel> findAllProducts(){
		return rewardsService.getDeatails();
	}
	
	@PostMapping("/bank/user/rewards")
	public List<DemoRewardsModel> addProducts(@RequestBody List<DemoRewardsModel> details) {
		return rewardsService.saveProducts(details);
  }
	
//	@DeleteMapping("rewards/delete/{id}")
//	public String deleteProduct(@PathVariable int RewardsAccountID) {
//		return rewardsService.deleteProduct(RewardsAccountID);
//	}
	
	@GetMapping("/rewards/{username}") 
	public Optional<DemoRewardsModel> show2(@PathVariable("username") String username){
		
		return rewRepo.findById(username);
		
	}
	
}
