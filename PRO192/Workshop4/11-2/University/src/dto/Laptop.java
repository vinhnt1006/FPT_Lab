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
public class Laptop {
    private String id;
    private String MAC;
    
    public Laptop(){
        id = "";
        MAC = "";
    }
    
    public Laptop(String id, String MAC) {
        this.id = id;
        this.MAC = MAC;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }
    
    public void inputLaptop(){
        try {
            id = Valid.inputString("Input id:");
            MAC = Valid.inputString("Input MAC");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    public void outputLaptop(){
        System.out.println("Id:" + id);
        System.out.println("MAC:" + MAC);
    }
}
