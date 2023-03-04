package com.gbp.pract3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gbp_a
 */
public class Seller {
    public void Modify(Telephone t){
        String oldName = t.getName().replace('a','o');
        String firstSymbol = oldName.substring(0,1);
        String newName;
        if(firstSymbol.equalsIgnoreCase("n")){
            newName = oldName;
        }else
        {
            newName = oldName.toLowerCase();
        }
        t.setName(newName);
    }
}
