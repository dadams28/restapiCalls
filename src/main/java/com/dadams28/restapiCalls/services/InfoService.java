package com.dadams28.restapiCalls.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dadams28.restapiCalls.database.CustomerAccountRepository;
import com.dadams28.restapiCalls.entity.CustomerAccount;
 
@Service("infoService")
public class InfoService {
    @Autowired
    CustomerAccountRepository caRepository;
    
    public CustomerAccount getCustomerInfo(Long id) {
    	return caRepository.findById(id).get();
    }
    
    /*
    public ArrayList<T> updateVehicleList(Long id) {
    	return getVehicleList(id);
    }
    
    public long getCustomerId() {
    	
    }
    */
}