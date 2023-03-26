/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author gbp_a
 */
public class LoaderRunnable implements Runnable{
    private String path;

    public LoaderRunnable(String path) {
        this.path = path;
    }
    
    @Override
    public void run() {
        FileInputStream fis;
        if (this.path!=null && new File(this.path).exists()){
            try {
                fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Message message = (Message)ois.readObject();
                ois.close();
                System.out.println(message.toString());
            } catch (ClassNotFoundException | IOException e){
                System.out.println("Loading error; Path: "+this.path);
                System.out.println(e.getMessage());
            }
        }
    }
}
