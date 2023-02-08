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
public class BeeColony extends Colony implements Role{
    
    private String type;
    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

    public BeeColony(int size, String Place, String type) {
        super(size, Place);
        this.type = type;
    }

    public BeeColony() {
        type = "";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "the colony’s type is " + type + ", size is about " + size + ", and the place is " + Place;
    }

    
}
