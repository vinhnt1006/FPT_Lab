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
public abstract class LivingGroup {
    private String name;

    public LivingGroup(String name) {
        this.name = name;
    }

    public LivingGroup() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void useWater(){
        System.out.println("Use Water");
    };
    
    public abstract void growBy();
}
