package io.usecase.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DemoAccountModel {

	
//	@GeneratedValue(generator = "uuid")
//	@GenericGenerator(name = "uuid", strategy = "uuid")
    @Id
	private String USER_ID;
	private int AccountNumber;
	private String AccountType;
	private int  AccountBranchCode;
	private int AccountBalance;
	private String AccountCurrency;
	private String AccountStatus;
	
	
	
	
	
	public DemoAccountModel() {
		super();
	}
	

	public DemoAccountModel(String uSER_ID, int accountNumber, String accountType, int accountBranchCode,
			int accountBalance, String accountCurrency, String accountStatus) {
		super();
		USER_ID = uSER_ID;
		AccountNumber = accountNumber;
		AccountType = accountType;
		AccountBranchCode = accountBranchCode;
		AccountBalance = accountBalance;
		AccountCurrency = accountCurrency;
		AccountStatus = accountStatus;
	}

	

	

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	
	public String getUSER_ID() {
		return USER_ID;
	}


	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public int getAccountBranchCode() {
		return AccountBranchCode;
	}
	public void setAccountBranchCode(int accountBranchCode) {
		AccountBranchCode = accountBranchCode;
	}
	public int getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		AccountBalance = accountBalance;
	}
	public String getAccountCurrency() {
		return AccountCurrency;
	}
	public void setAccountCurrency(String accountCurrency) {
		AccountCurrency = accountCurrency;
	}
	public String getAccountStatus() {
		return AccountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}
	
	
	
	
}
