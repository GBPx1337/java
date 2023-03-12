/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gbp.pract4;

/**
 *
 * @author gbp_a
 */
public class Telephone {
    private String model;
    private String serial;
    private String color;
    private boolean wireless;

    public Telephone(String model, String serial, String color, boolean wireless) {
        this.model = model;
        this.serial = serial;
        this.color = color;
        this.wireless = wireless;
    }

    public String getModel() {
        return model;
    }

    public String getSerial() {
        return serial;
    }

    public String getColor() {
        return color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return this.model + ", " + this.serial + ", " + this.color + ", " + this.wireless;
    }
}
