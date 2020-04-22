package io.usecase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.usecase.entity.User;
import io.usecase.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUserName(username);
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), new ArrayList<>());
    }
    
  
    
    
    public List<User> saveAll(List<User> details){
    	
    	return repository.saveAll(details);
    }
    
    
    public List<User> findAll(){
    	return repository.findAll();
    }
}