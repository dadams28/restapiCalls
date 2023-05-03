package com.dadams28.restapiCalls.entity;

import java.util.*;
import javax.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.ToString;

@Document(collection = "accounts")
public class CustomerAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @ToString.Exclude private long id;
	
	private String username;
	@ToString.Exclude private String password;
    private ArrayList<Vehicle> vehicleList;
    
    public CustomerAccount() {
    }

    public CustomerAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String password) {
		this.username = username;
	}
	
	public String getPassword() {
		return username;
	}

	public void setPassword(String password) {
		this.username = username;
	}
	
	public void addVehicle(Vehicle veh) {
		vehicleList.add(veh);
	}

	public void getVehicleList() {
		//GET * WHERE id == id
		//SET vehicleList to all vehicles with matching ID
	}
}
