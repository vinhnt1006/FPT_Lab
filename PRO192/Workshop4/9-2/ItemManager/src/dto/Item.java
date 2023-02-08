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
public class Item {

    private int value;
    private String creator;

    public Item() {
        value = 0;
        creator = "";
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void inputItem() {
        try {
            value = Valid.inputNum("Input Value");
            creator = Valid.inputString("Input Creator");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void outputItem() {
        System.out.println("Value:" + value);
        System.out.println("Creator:" + creator);
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return value + "," + creator;
    }
    
    
}
