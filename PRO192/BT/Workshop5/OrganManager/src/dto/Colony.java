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
public class Colony extends Organization {

    String Place;

    public Colony(int size, String Place) {
        super(size);
        this.Place = Place;
    }

    public Colony() {
        super();
        Place = "";
    }

    @Override
    void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }

    public void grow() {
        System.out.println("An annual cycle of growth that begins in spring");
    }

    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "the colony’s size is " + size + ", the colony’s place is " + Place; //To change body of generated methods, choose Tools | Templates.
    }

}
