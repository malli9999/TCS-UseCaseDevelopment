package io.usecase.entity;

import javax.persistence.Id;

import lombok.Data;

@Data
public class DemoUserTrans {

	private String session;
	private String account;
	
	
	
	
	public DemoUserTrans() {
		super();
	}
	
	
	public DemoUserTrans(String session, String account) {
		super();
		this.session = session;
		this.account = account;
	}


	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	
	
	
	
}
