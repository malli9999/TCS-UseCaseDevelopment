package io.usecase.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoAccountService {

	@Autowired
	private DemoAccountRepository accountRepository;

	// Get Method
	public List<DemoAccountModel> getServiceDetails(){
		return (List<DemoAccountModel>) accountRepository.findAll();
		}
	
	
	//For Posting Details
	public List<DemoAccountModel> saveProducts(List<DemoAccountModel> details)
	{
		return  accountRepository.saveAll(details);
	}
	
	
	//For Updating the Details
	public DemoAccountModel updateProduct(DemoAccountModel product) {
		DemoAccountModel existingProduct = accountRepository.findById(product.getUSER_ID()).orElse(null);

		existingProduct.setAccountNumber(product.getAccountNumber());
		existingProduct.setAccountType(product.getAccountType());;
		existingProduct.setAccountBranchCode(product.getAccountBranchCode());
		existingProduct.setAccountBalance(product.getAccountBalance());
		existingProduct.setAccountCurrency(product.getAccountCurrency());
		existingProduct.setAccountStatus(product.getAccountStatus());
	return accountRepository.save(existingProduct);
	}
	

	//For Deletion
//	public String deleteProduct(int AccountNumber) {
//		accountRepository.deleteById(AccountNumber);
//	return "product removed"+ AccountNumber;
//	}
	
	
}
