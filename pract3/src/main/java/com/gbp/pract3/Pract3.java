/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gbp.pract3;

import java.util.Scanner;

/**
 *
 * @author gbp_a
 */
public class Pract3 {

    public static void main(String[] args) {
        System.out.println("Task 3. Variant 2. Student Malikov G.A. RIBO-04-21\n");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter telephone name: ");
        String name = scan.nextLine();
        
        Telephone telephone = new Telephone(name);
        Seller seller = new Seller();
        System.out.println(telephone.toString());
        
        seller.Modify(telephone);
        System.out.println(telephone.toString());
    }
}
