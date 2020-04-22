package io.usecase.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
public class DemoUserSessionId {

   private String Customer_Session_Id;
   private String userName;
   private String session;



   
   

public String getSession() {
	return session;
}



public void setSession(String session) {
	this.session = session;
}



public String getCustomer_Session_Id() {
	return Customer_Session_Id;
	
}



public void setCustomer_Session_Id(String customer_Session_Id) {
	Customer_Session_Id = customer_Session_Id;
}




public String getUserName() {
	return userName;
}




public void setUserName(String userName) {
	this.userName = userName;
}

@Override
public String toString() {
	return "DemoUserSessionId [Customer_Session_Id=" + Customer_Session_Id + ", userName=" + userName + "]";
} 






}

