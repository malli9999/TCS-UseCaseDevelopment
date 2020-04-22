package io.usecase.entity;

public class DemoSession {
	
	private String Customer_Session_Id;
	

	public DemoSession(String customer_Session_Id) {
		super();
		Customer_Session_Id = customer_Session_Id;
	}

	
	public String getCustomer_Session_Id() {
		return Customer_Session_Id;
	}

	public void setCustomer_Session_Id(String customer_Session_Id) {
		Customer_Session_Id = customer_Session_Id;
	}
	
	
}
