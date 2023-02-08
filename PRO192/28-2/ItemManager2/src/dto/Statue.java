/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import mylib.Valid;

/**
 *
 * @author Razer Blade
 */
public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
        super();
        weight = 0;
        colour = "";
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
//    
//    public void inputStatue(){        
//        try{
//            inputItem();
//            weight=Validation.inputInteger("Input weight: ");
//            colour=Validation.inputString("Input colour: ");
//        }catch (Exception e){
//            System.out.println("Error");
//        }
//    }
//    
//    public void outStatue() {
//        outItem();
//        System.out.println("weight: "+weight);
//        System.out.println("colour: "+colour);
//    }

    @Override
    public void outItem() {
        super.outItem(); 
        System.out.println("weight: " + weight);
        System.out.println("colour: " + colour);
    }

    @Override
    public void inputItem() {
        super.inputItem(); 
        try {
            weight = Valid.inputNum("Input weight: ");
            colour = Valid.inputString("Input colour: ");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
