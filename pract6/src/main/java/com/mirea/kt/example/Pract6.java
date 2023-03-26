/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mirea.kt.example;

import java.util.Scanner;

/**
 *
 * @author gbp_a
 */
public class Pract6 {

    public static void main(String[] args) {
        System.out.println("Task 6. Variant 2. Student Malikov G.A. RIBO-04-21\n");
        
        Scanner scan = new Scanner(System.in);
        //Message message = new Message(1337, "Some text to send", "MSG", false, 20230326);
        
        System.out.println("Enter deserialization file path: ");
        String path = scan.next();
        //String path = "G:/java6task/message.ser";
        
        LoaderRunnable loader = new LoaderRunnable("G:/java6task/message.ser");
        Thread th = new Thread(loader);
        th.start();
        
    }
}
