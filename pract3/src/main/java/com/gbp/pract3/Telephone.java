/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gbp.pract3;

/**
 *
 * @author gbp_a
 */
public class Telephone {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Telephone(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Telephone{" + "name=" + name + '}';
    }
    
}
