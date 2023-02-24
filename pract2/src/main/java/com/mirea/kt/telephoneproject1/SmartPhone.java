/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.telephoneproject1;

/**
 *
 * @author telecom
 */
public class SmartPhone extends TelephoneParrent{
    
    private String screenType;
    private String screenResolution; //1080*1920
    private String operationSystem;
    
    public void openApp(){
    //
    }
    public void closeApp(){
    //
    }
    public void checkForUpdates(){
    //
    }
    
    public SmartPhone(String screenType, String screenResolution, String operationSystem, String phoneNumber, String countryOrigin, String operator) {
        super(phoneNumber, countryOrigin, operator);
        this.screenType = screenType;
        this.screenResolution = screenResolution;
        this.operationSystem = operationSystem;
    }


    @Override
    public String toString() {
        return "\nScreen type="+this.screenType+"\nScreen resolution="+this.screenResolution+"\nOS="+this.operationSystem+"\nOrigin="+getCountryOrigin()+"\nOperator="+getOperator()+"\nNumber="+getPhoneNumber();
    }
    
    
}
