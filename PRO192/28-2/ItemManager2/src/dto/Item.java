/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import mylib.Valid;

/**
 *
 * @author Razer Blade
 */
public class Item implements Comparable<Item>, Serializable {

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
            value = Valid.inputNum("Input value: ");
            creator = Valid.inputString("Input creator: ");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void outItem() {
        System.out.println("Item:");
        System.out.println("value: " + value);
        System.out.println("creator: " + creator);
    }

    @Override
    public int compareTo(Item o) {
        if (value > o.getValue()) {
            return 1;
        } else if (value < o.getValue()) {
            return -1;
        }
        return 0;
    }

}
