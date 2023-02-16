
package com.gbp.pract1;

import java.util.Scanner;

/**
 *
 * @author gbp_a
 */
public class Pract1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Task 1. Variant 2. Student Malikov G.A. RIBO-04-21\n");
        System.out.println("Bank calculator\n");
        
        System.out.println("Enter deposit duration(months): ");        
        int months = scan.nextInt();
        
        System.out.println("\nEnter year percent: ");
        float percent= scan.nextFloat();
        
        System.out.println("\nEnter base deposit: ");
        float base_deposit = scan.nextFloat();
        
        if (months<1 | percent<=0f | base_deposit<=0f){
            
            System.out.println("\nInvalid arguments");

        }else{
           
        float new_deposit=base_deposit;
        for (int i = 0;i<months;i++){  
            new_deposit=new_deposit*(1+percent/(12f*100f));   
        }
        
        System.out.println("\nDeposit after: ");
        System.out.println(new_deposit); 
        }  
    }
}
