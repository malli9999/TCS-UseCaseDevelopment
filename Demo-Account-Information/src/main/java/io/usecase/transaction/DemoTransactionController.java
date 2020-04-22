package io.usecase.transaction;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.usecase.account.DemoAccountModel;


@RestController
public class DemoTransactionController {
	
	@Autowired DemoTransactionService transactionService;
	
	@Autowired private DemoTransactionRepository transactionRepository;
	
	@GetMapping("/products")
	public List<DemoTransactionModel> findAllProducts(){
		return transactionService.findAll();
	}

	@PostMapping("/bank/user/dashboard/transactions")
	public List<DemoTransactionModel> addProducts(@RequestBody List<DemoTransactionModel> products) {
		return transactionService.saveAllProducts(products);
  }
	
	
//	@DeleteMapping("/delete/{id}")
//	public String deleteProduct(@PathVariable int id) {
//		return transactionService.deleteProduct(id);
//	}
	
	
	@GetMapping("/transaction/{accountnumber}") // /acc/{username}
	public Optional<DemoTransactionModel> show1(@PathVariable("accountnumber") String accountnumber){
		
		return transactionRepository.findById(accountnumber);
		
	}
	
}



