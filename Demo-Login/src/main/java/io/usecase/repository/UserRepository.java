package io.usecase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.usecase.entity.User;

public interface UserRepository extends JpaRepository<User,String> {

	User findByUserName(String username);
//	User findByCustomer_Session_Id(String customer_Session_Id);
	User findByUserid(String userid);
	
	
	

 
 
}