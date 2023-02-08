/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

/**
 *
 * @author NK
 */
public class AirConditioner implements Menu {
    private String name;
    
    @Override
    public void on() {
        System.out.println("....");
    }

    @Override
    public void off() {
        System.out.println("....");
    }

    public AirConditioner() {
        name = "Panasonic";
    }

    public AirConditioner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
