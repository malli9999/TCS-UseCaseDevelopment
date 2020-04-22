package io.usecase.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DemoTransactionService {

	@Autowired
	private DemoTransactionRepository demoTransactionRepository;
	
	
	// Get Method 
	public List<DemoTransactionModel> findAll(){
		return demoTransactionRepository.findAll();
		}
	

	//POST METHOD
	public List<DemoTransactionModel> saveAllProducts(List<DemoTransactionModel> products)
	{
		return demoTransactionRepository.saveAll(products);
	}
	
	
	//DELETE METHOD
//	public String deleteProduct(int AccountNumber) {
//		demoTransactionRepository.deleteById(AccountNumber);
//		return "product removed"+ AccountNumber;
//		}
	
	
}
