/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.telephoneproject1;

import java.util.Scanner;

/**
 *
 * @author telecom
 */
public class TelephoneProject1 {

    public static void main(String[] args) {
        System.out.println("Task 2. Variant 2. Student Malikov G.A. RIBO-04-21\n");
        System.out.println("Choose telephone type:\n");
        System.out.println("[1] - smartphone\n");
        System.out.println("[2] - stationary phone");
        
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        

        String screenType;
        String screenResolution;
        String operationSystem;
        String phoneNumber;
        String countryOrigin;
        String operator;
        String dialationType;
        String deviceType;
        boolean wirelessHandset;
        
        switch (choose){
            case 1:
                System.out.println("\nScreen type:");
                screenType = scan.nextLine();
                
                System.out.println("\nScreen resolution:");
                screenResolution = scan.nextLine();
                
                System.out.println("\nOperation system:");
                operationSystem = scan.nextLine();
                
                System.out.println("\nPhone number:");
                phoneNumber = scan.nextLine();
                
                System.out.println("\nCountry:");
                countryOrigin = scan.nextLine();
                
                System.out.println("\nOperator");
                operator = scan.nextLine();
                

                SmartPhone smart = new SmartPhone(screenType,screenResolution,operationSystem,phoneNumber,countryOrigin,operator);
                System.out.println(smart.toString());
                break;
            case 2:
                
                System.out.println("\nDialation type (Buttons or Rotor):");
                dialationType = scan.nextLine();
                
                System.out.println("\nDevice type (Analog or Digital):");
                deviceType = scan.nextLine();
                
                System.out.println("\nWireless handset (True or False):");
                wirelessHandset = scan.nextBoolean();
                
                System.out.println("\nPhone number:");
                phoneNumber = scan.nextLine();
                
                System.out.println("\nCountry:");
                countryOrigin = scan.nextLine();
                
                System.out.println("\nOperator");
                operator = scan.nextLine();
                
                StationaryPhone stat = new StationaryPhone(dialationType, deviceType, wirelessHandset, phoneNumber, countryOrigin, operator);
                System.out.println(stat.toString());
                
                break;
            default:
                System.out.println("Incorrect argument");
        }
    }
}
