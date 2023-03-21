/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gbp.pract5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gbp_a
 */
public class Pract5 {

    public static void main(String[] args) {
        
        boolean testLaunch = false;
        
        System.out.println("Task 5. Variant 2. Student Malikov G.A. RIBO-04-21\n");
        
        String fileNameOriginal="original.txt";
        String fileNameMirrored="mirrored.txt";
        String path="G:\\java5task";
        
        if(!testLaunch){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter original file name(with .txt extension):");
            fileNameOriginal = scan.next();
            System.out.println("Enter mirrored file(will be created if does not exist yet) name(with .txt extension):");
            fileNameMirrored = scan.next();
            System.out.println("Enter file path: ");
            path = scan.next();
        }

        if (!fileNameOriginal.equals(fileNameMirrored)){
            
            File fileOriginal = new File(path+"/"+fileNameOriginal);
            File fileMirrored = new File(path+"/"+fileNameMirrored);

            if(fileOriginal.exists()){
                try{
                    FileUtils.writeLinesFromOriginalToMirrored(fileOriginal, fileMirrored);
                    if(!fileMirrored.exists()){
                        fileMirrored.createNewFile();
                    }
                }catch(IOException e){
                    System.out.println("Error:");
                    System.out.println(e.getMessage());
                }

            }else{
                System.out.println("\nOriginal file was not found");
            }
        }else{
            System.out.println("\nFile names are dublicating");
        }
        
    }
}
