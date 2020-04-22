package io.usecase.rewards;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DemoRewardsService {

	@Autowired
	private DemoRewardsRepository demorepository;
	
	// Get Method
     public List<DemoRewardsModel> getDeatails(){
		return demorepository.findAll();
		}
	
	

	
	//For Posting Details
	public List<DemoRewardsModel> saveProducts(List<DemoRewardsModel> details)
	{
		return demorepository.saveAll(details);
	}
	
	
	
	//For Updating the Details
//	public DemoAccountModel updateProduct(DemoAccountModel product) {
//		DemoAccountModel existingProduct = repository.findById(product.getUSER_ID()).orElse(null);
//
//		existingProduct.setAccountNumber(product.getAccountNumber());
//		existingProduct.setAccountType(product.getAccountType());;
//		existingProduct.setAccountBranchCode(product.getAccountBranchCode());
//		existingProduct.setAccountBalance(product.getAccountBalance());
//		existingProduct.setAccountCurrency(product.getAccountCurrency());
//		existingProduct.setAccountStatus(product.getAccountStatus());
//	return repository.save(existingProduct);
//	}
	

//	//For Deletion
//	public String deleteProduct(int RewardsAccountID) {
//	demorepository.deleteById(RewardsAccountID);
//	return "product removed"+ RewardsAccountID;
//	
//	
//}
}
