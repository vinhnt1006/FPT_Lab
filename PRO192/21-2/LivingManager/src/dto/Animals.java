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
public class Animals extends LivingGroup{

    private String gender;
    
    @Override
    public void growBy() {
        System.out.println("Grow by Food");
    }

    public void run(){
        System.out.println("Run by Leg");
    }

    public Animals(String gender, String name) {
        super(name);
        this.gender = gender;
    }

    public Animals(String gender) {
        super();
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
}
