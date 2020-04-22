package io.usecase;

public class LogoffResponse {
	
	private String loginStatus;

	
//	
//	public LogoffResponse(String loginStatus) {
//		super();
//		this.loginStatus = loginStatus;
//	}
//	
	

	public LogoffResponse(String loginStatus2) {
		this.loginStatus = loginStatus2;
	}



	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	
	

}
