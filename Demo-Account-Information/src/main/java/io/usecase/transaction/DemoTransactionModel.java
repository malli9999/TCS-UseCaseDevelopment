package io.usecase.transaction;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class DemoTransactionModel {

	@Id
	private String AccountNumber;
	private String TransactionDate;
	private int TransactionAmount;
	private String TransactionCurrency;
	private  String TrannsactionStatus;
	private String TransactionDescription;
	
	
	
	
	public DemoTransactionModel() {
		super();
	}

	public DemoTransactionModel(String accountNumber, String transactionDate, int transactionAmount,
			String transactionCurrency, String trannsactionStatus, String transactionDescription) {
		super();
		AccountNumber = accountNumber;
		TransactionDate = transactionDate;
		TransactionAmount = transactionAmount;
		TransactionCurrency = transactionCurrency;
		TrannsactionStatus = trannsactionStatus;
		TransactionDescription = transactionDescription;
	}
	
	

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public int getTransactionAmount() {
		return TransactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		TransactionAmount = transactionAmount;
	}
	public String getTransactionCurrency() {
		return TransactionCurrency;
	}
	public void setTransactionCurrency(String transactionCurrency) {
		TransactionCurrency = transactionCurrency;
	}
	public String getTrannsactionStatus() {
		return TrannsactionStatus;
	}
	public void setTrannsactionStatus(String trannsactionStatus) {
		TrannsactionStatus = trannsactionStatus;
	}
	public String getTransactionDescription() {
		return TransactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		TransactionDescription = transactionDescription;
	}
	
	
}
