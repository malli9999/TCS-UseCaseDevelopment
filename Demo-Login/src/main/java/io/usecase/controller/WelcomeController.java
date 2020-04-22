
package io.usecase.controller;

import java.util.List;

import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import io.usecase.entity.*;
import io.usecase.entity.AuthRequest;
import io.usecase.entity.User;
import io.usecase.repository.UserRepository;
import io.usecase.service.CustomUserDetailsService;
//import io.usecase.util.jwtUtil;

@RestController
public class WelcomeController {


//@Autowired
//  private jwtUtil jwtutil;
@Autowired
private AuthenticationManager authenticationManager;
@Autowired
private CustomUserDetailsService service;
@Autowired
private UserRepository repo;
String us;
private String session;
private String name;
@Autowired private DemoAccountModel demo;
 private DemoTransactionModel transmodel;
 private DemoRewardsModel rewmodel;
 private DemoSession sess;
@Autowired private User user;

@Autowired
private RestTemplate restTemplate;




    @PostMapping("/bank/user/authentication")
    public User generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
            		
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())              
                 
            		);
            name=authRequest.getUserName();
                    
                    session = RequestContextHolder.currentRequestAttributes().getSessionId();
//                    System.out.println(sess);
                    User user=repo.findByUserName(authRequest.getUserName());
                    System.out.println(user.getUserid());
//                    user.setSession_Id(sess);
                    user.setCustomer_Session_Id(session);
                    repo.save(user);
                    us=authRequest.getUserName();

        } catch (Exception ex) {
        	
            throw new Exception("inavalid username/password");
        }
        return repo.findByUserName(us) ;
    }
   

@RequestMapping("/")
public User welcome() {
	System.out.println("welcome to TCS ");
    return repo.findByUserName(us);
}

@GetMapping("/session")
public String  getSessionId() {
	System.out.println("The session fo the customer is: ");
	 session = RequestContextHolder.currentRequestAttributes().getSessionId();
	 System.out.println(session);
	return session;
	
	
	
}
//Post Mapping for the user Account Information
@PostMapping("/bank/user/dashboard/accountInfo")
public DemoAccountModel getDeatils(@RequestBody DemoUserSessionId sess) {

	try {
		System.out.println("Testing Inside");
	System.out.println(sess.getUserName());	
	System.out.println(sess.getCustomer_Session_Id());
	
	User user = repo.findByUserName(sess.getUserName());
	System.out.println("For new session" + sess.getSession());
	String name = sess.getUserName();
	System.out.println(sess.getUserName());
	System.out.println("asasa"+user.getCustomer_Session_Id());
	if(sess.getUserName().equals(user.getUserName()) && user.getCustomer_Session_Id().equals(sess.getSession())) {
		System.out.println("Inside the Current User Block");
		demo = restTemplate.getForObject("http://localhost:9180/acc/"+ sess.getUserName(), DemoAccountModel.class);
		
	}
	else {
		System.out.println("In Else Block");
		demo.setAccountBalance(0);
		demo.setAccountStatus(null);
		demo.setAccountBranchCode(0);
		demo.setAccountCurrency(null);
		demo.setAccountType(null);
		demo.setUSER_ID("0");
		demo.setAccountNumber(0);
		
	}
	return demo;
	}
	 finally {
		System.out.println("In the Finall Block");
	}
	
}

//Post Mapping for the user Transaction  Information


@PostMapping("/bank/user/dashboard/transactions")
public DemoTransactionModel getTransDeatils(@RequestBody DemoUserTrans trans) {
	
	try {
	System.out.println("Testing Inside the  Transaction");
	User user = repo.findByUserName(name);
	System.out.println("Trans ACCOUNT NUMBER " + trans.getAccount());	
	System.out.println("user session id is " + user.getCustomer_Session_Id()); 
	System.out.println("Trans session id  Number "+trans.getSession());

	transmodel = restTemplate.getForObject("http://localhost:9180/transaction/"+ trans.getAccount(), DemoTransactionModel.class);

	if(trans.getSession().equals(user.getCustomer_Session_Id())) {
		System.out.println("Inside the Current User Block");
	return transmodel;
		}
	else {
		System.out.println("In Else Block");
		return transmodel;
		 }

	}
	 finally {
		System.out.println("In the Finall Block");
		System.out.println("transmodel AccountNumber "+ transmodel.getAccountNumber());
	 }
	
}
@GetMapping("/bank/user/rewards/{username}")
public DemoRewardsModel getRewards(@PathVariable("username") String username){
	
	rewmodel = restTemplate.getForObject("http://localhost:9180/rewards/" + username, DemoRewardsModel.class);
	return rewmodel;
}

@DeleteMapping("/bank/user/authentication/{session}")
public String deactivatingUser(@PathVariable  String session) {
	 session = RequestContextHolder.currentRequestAttributes().getSessionId();
	 //sess = restTemplate.getForObject("http://localhost:8183/user/deactive"+ session, DemoSession.class);
	
	 
	 if(session!= null) {
		 
		 user.setSession_Id("InActive");
		 repo.save(user);
		 System.out.println("Consoling the user "+user);
	 }
	 else {
		 throw new UsernameNotFoundException("The User Does not exist");
	 }
	 
	return sess + "Sucessfully Logged out" ;
	
}	
	@PutMapping(path="user/deactiveSession")
		public String deactiveSession(@RequestBody Session sid) throws Exception {
		
//		user = repo.findByCustomer_Session_Id(sid.getId());
		String userid = "malli@gmail.com";
		user = repo.findByUserid(userid);
		
		if(user!= null) {
			user.setSession_Id("INACTIVE");
			repo.save(user);
			return "Success";
		}
		else {
			throw new Exception("invalid session id " + sid);
		}
		
	}
	
}