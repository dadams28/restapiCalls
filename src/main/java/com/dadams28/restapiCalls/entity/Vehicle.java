/*
 * THIS CLASS WAS ORIGNIALLY DESIGNED BY BRYCE, 
 * USED ONLY FOR LOCAL TESTING BEFORE COUPLING.
 */
package com.dadams28.restapiCalls.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    private String licensePlate;

    private String vin;

    private int manufactureYear;

    private String manufactureMake;

    private String manufactureModel;

    private long custID;

}