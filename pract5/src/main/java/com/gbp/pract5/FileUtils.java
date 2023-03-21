/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gbp.pract5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gbp_a
 */
public class FileUtils {

    public static String readStringLineFromFile(File f) throws FileNotFoundException,IOException{
        String line = null;
        
        if (f.exists()){
            FileInputStream fis = new FileInputStream(f);
            fis.read();
        }
        return line;
    }
    
    public static void writeStringToFile(File file, String str) throws IOException{
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(str);
            fw.flush();
            fw.close();
        }catch(IOException e){
            System.out.println("File writing error:");
            System.out.println(e.getMessage());
        }
    }
    
    public static void writeLinesFromOriginalToMirrored(File original,File mirrored) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(original))) {
            String line;
            String finalString = "";
            while ((line = br.readLine()) != null) {
                String mirroredLine = reverseString(line)+"\n";
                finalString=finalString+mirroredLine;
                //System.out.println(mirroredLine);
                FileUtils.writeStringToFile(mirrored, finalString.substring(0, finalString.length()));
            }
            br.close();
       }
    }
    
    /*
    public static void write2(File original,File mirrored){
        try {
            FileInputStream fis = new FileInputStream(original);
            FileOutputStream fos = new FileOutputStream(mirrored);
            int i = -1;
            while((i = fis.read()) != -1){ //считываем поток побайтно
                System.out.print((char)i); // делаем из байта символ
            }
            fis.close();
            
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }
    */
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
}
            
}
