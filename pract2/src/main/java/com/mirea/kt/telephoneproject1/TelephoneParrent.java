/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.telephoneproject1;

/**
 *
 * @author telecom
 */
public class TelephoneParrent {
    private String phoneNumber;
    private String countryOrigin;
    private String operator;
    
    public void makeCall(){
    //
    }
    
    public void onPower(){
    //
    }
    
    public void offPower(){
    //
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public String getOperator() {
        return operator;
    }

    public TelephoneParrent(String phoneNumber, String countryOrigin, String operator) {
        this.phoneNumber = phoneNumber;
        this.countryOrigin = countryOrigin;
        this.operator = operator;
    }
    
}
