package com.dadams28.restapiCalls.database;
import com.dadams28.restapiCalls.entity.*;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAccountRepository extends MongoRepository<CustomerAccount, Long> {
	boolean findByUsername(String username);
}