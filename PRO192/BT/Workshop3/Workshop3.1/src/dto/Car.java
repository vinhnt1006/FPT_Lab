/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author NK
 */
public class Car {

    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;

    //constructors
    public Car() {
        Colour = null;
        EnginePower = 0;
        Convertible = false;
        ParkingBrake = false;
    }

    public Car(String mColour, int mEnginePower, boolean mConvertible, boolean mParkingBrake) {
        Colour = mColour;
        EnginePower = mEnginePower;
        Convertible = mConvertible;
        ParkingBrake = mParkingBrake;
    }

    //getters
    public String getColour() {
        return Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean getConvertible() {
        return Convertible;
    }

    public boolean getParkingBrake() {
        return ParkingBrake;
    }

    //setters
    public void setColour(String mColour) {
        if (mColour != null && !mColour.isEmpty()) {
            Colour = mColour;
        }
    }

    public void setEnginePower(int mEnginePower) {
        EnginePower = mEnginePower;
    }

    public void setConvertible(boolean mConvertible) {
        Convertible = mConvertible;
    }

    public void setParkingBrake(boolean mParkingBrake) {
        ParkingBrake = mParkingBrake;
    }

    //other logic methods
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    public void output() {
        System.out.println("Colour: " + Colour);
        System.out.println("EnginePower = " + EnginePower);
        System.out.println("Convertible = " + Convertible);
        System.out.println("ParkingBrake = " + ParkingBrake);
        System.out.println("\n");
    }
}
