package com.dadams28.restapiCalls.services;
 
import java.util.ArrayList;
import lombok.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dadams28.restapiCalls.database.CustomerAccountRepository;
import com.dadams28.restapiCalls.entity.CustomerAccount;
 
@Service("loginService")
public class LoginService {
    @Autowired
    CustomerAccountRepository caRepository;
    
    public boolean validate(String username, String password) {
    	ArrayList<CustomerAccount> accs = (ArrayList<CustomerAccount>) caRepository.findAll();
    	
    	for (CustomerAccount acc : accs) {
    		if (acc.getUsername() == username) {
    			if (acc.getPassword() == password) {
    				return true;
    			}
    		}
    	}
    	return false;
    }  
    
    public void saveAccount(CustomerAccount cusAcc) {
    	caRepository.save(cusAcc);
    }
}