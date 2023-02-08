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
public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
        super();
        height = 0;
        material = "";
    }

    public Vase(int height, String material, int value, int creator) {
        super(value, material);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

//    public void inputVase(){
//        inputItem();
//        try {
//            height = Valid.inputNum("Input Height");
//            material = Valid.inputString("Input material");
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//    }
    @Override
    public void inputItem() {
        //super.inputItem(); //To change body of generated methods, choose Tools | Templates.
        try {
            super.inputItem();
            height = Valid.inputNum("Input Height");
            material = Valid.inputString("Input material");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

//    
//    public void outputVase(){
//        outputItem();
//        System.out.println("Height:" + height);
//        System.out.println("Material:" + material);
//    }
    @Override
    public void outputItem() {
        super.outputItem(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Height:" + height);
        System.out.println("Material:" + material);
    }

    @Override
    public String toString() {
        return super.toString() + "," + height + "," + material; //To change body of generated methods, choose Tools | Templates.
    }
    
}
