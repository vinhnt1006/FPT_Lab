/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import mylib.Valid;

/**
 *
 * @author NK
 */
public class Statue extends Item{
    private int weight;
    private String colour;
    public Statue(){
        super();
        weight = 0;
        colour = "";
    }
    
    public Statue(int weight, String colour, int value, int creator){
        super(value, colour);
        this.weight = weight;
        this.colour = colour;
    }
    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
//    public void inputStatue(){
//        inputItem();
//        try {
//            weight = Valid.inputNum("Input Weight");
//            colour = Valid.inputString("Input Colour");
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//    }
//    
//    public void outputStatue(){
//        outputItem();
//        System.out.println("Weight:" + weight);
//        System.out.println("Colour:" + colour);
//    }

    @Override
    public void outputItem() {
        try {
            super.outputItem();
            weight = Valid.inputNum("Input Weight");
            colour = Valid.inputString("Input Colour");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public void inputItem() {
        super.inputItem(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Weight:" + weight);
        System.out.println("Colour:" + colour);
    }

    @Override
    public String toString() {
        return super.toString() + "Weight:" + weight + "\nColour:" + colour; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
