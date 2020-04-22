package io.usecase.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
@Table(name = "LOGIN_TABLE")
public class User {
	
    @Id
    private String userid;
    private String password;
    private String userName;
    private Date Last_Login_Date;
    private String Customer_Type;
    private String Customer_Session_Id;
    private String Session_Id;
    
    
    
	public User() {
		super();
	}
	
	public User(String userid, String password, String userName, Date last_Login_Date, String customer_Type,
			String session_Id) {
		super();
		this.userid = userid;
		this.password = password;
		this.userName = userName;
		Last_Login_Date = last_Login_Date;
		Customer_Type = customer_Type;

		Session_Id = session_Id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getLast_Login_Date() {
		return Last_Login_Date;
	}
	public void setLast_Login_Date(Date last_Login_Date) {
		Last_Login_Date = last_Login_Date;
	}
	public String getCustomer_Type() {
		return Customer_Type;
	}
	public void setCustomer_Type(String customer_Type) {
		Customer_Type = customer_Type;
	}
	public String getCustomer_Session_Id() {
		return Customer_Session_Id;
	}
	public void setCustomer_Session_Id(String customer_Session_Id) {
		Customer_Session_Id = customer_Session_Id;
	}
	public String getSession_Id() {
		return Session_Id;
	}
	public void setSession_Id(String session_Id) {
		Session_Id = session_Id;
	}
    

}
	