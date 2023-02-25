/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.telephoneproject1;

/**
 *
 * @author gbp_a
 */
public class StationaryPhone extends TelephoneParrent{
    
    private String dialationType; //Buttons or Rotor
    private String deviceType; // Analog or Digital
    private boolean wirelessHandset; //True or False

    public void recordAutoresponder(){
    //
    }
    
    public void listenReceivedMessages(){
    //
    }
    
    public void dialNumber(){
    //
    }
    
    public String getDialationType() {
        return dialationType;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public boolean isWirelessHandset() {
        return wirelessHandset;
    }

    public void setDialationType(String dialationType) {
        this.dialationType = dialationType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public void setWirelessHandset(boolean wirelessHandset) {
        this.wirelessHandset = wirelessHandset;
    }

    @Override
    public String toString() {
        return "\nDialation type="+this.dialationType+"\nDevice type="+this.deviceType+"\nWireless handset="+this.wirelessHandset+"\nOrigin="+getCountryOrigin()+"\nOperator="+getOperator()+"\nNumber="+getPhoneNumber();
    }
    
    
    
    public StationaryPhone(String dialationType,String deviceType,boolean wirelessHandset,String phoneNumber, String countryOrigin, String operator) {
        super(phoneNumber, countryOrigin, operator);
        this.dialationType=dialationType;
        this.deviceType=deviceType;
        this.wirelessHandset=wirelessHandset;
        
    }
    
}
