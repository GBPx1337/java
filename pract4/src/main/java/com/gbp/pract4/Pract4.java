/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gbp.pract4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gbp_a
 */
public class Pract4 {

    public static void main(String[] args) {
        System.out.println("Task 4. Variant 2. Student Malikov G.A. RIBO-04-21\n");
        Scanner scan = new Scanner(System.in);
        ArrayList<Telephone> telephoneList = new ArrayList<>();
        boolean endProgramm = false;
        
        telephoneList.add(new Telephone("Nokia 3210", "ZXC123ZXC", "Gray", true));
        telephoneList.add(new Telephone("IPhone XR", "QWERTY456654", "Green", true));
        telephoneList.add(new Telephone("Samsung Galaxy S22", "GHJKL3228", "Silver", true));
        
        
        
        while (endProgramm!=true){
            printTelephoneList(telephoneList);
            System.out.println("\n1 - Add a new phone\n2 - Delete existing phone by it's serial number\n3 - Delete all phones\nAny other - End programm");
            String input = scan.next();
            switch (input){
                case "1":
                    scan.nextLine();
                    System.out.println("Model:");
                    String model = scan.nextLine();
                    
                    System.out.println("Serial number:");
                    String serial = scan.nextLine();
                    
                    boolean matching=false;
                    for(Telephone t : telephoneList){
                        if (t.getSerial().equalsIgnoreCase(serial)){
                            System.out.println("Serial number is already in the list: ");
                            System.out.println(t.toString());
                            matching=true;
                            break;
                        }
                    }
                    if (matching){
                        break;
                    }
 
                    System.out.println("Color:");
                    String color = scan.nextLine();
                    
                    System.out.println("Wireless(true/false):");
                    Boolean wireless = scan.nextBoolean();
                    
                    telephoneList.add(new Telephone(model, serial, color, wireless));
                break;
                case "2":
                    
                    scan.nextLine();
                    System.out.println("Serial number:");
                    String serialDeletion = scan.next();
                    
                    boolean deleted = false;
                    for(Telephone t : telephoneList){
                        if (t.getSerial().equalsIgnoreCase(serialDeletion)){
                            telephoneList.remove(t);
                            deleted=true;
                            break;
                        }
                    }
                    if (!deleted){
                        System.out.println("No entries were found");
                        break;
                    }
                    
                break;
                case "3":
                    telephoneList.clear();
                break;
                default:
                    endProgramm=true;
                break;
            }
            
        }
        
    }
    public static void printTelephoneList(ArrayList<Telephone> telephoneList){
        System.out.println("\nList size: "+telephoneList.size());
        for(Telephone t : telephoneList){
            System.out.println(t.toString());
            }
        }
    }
