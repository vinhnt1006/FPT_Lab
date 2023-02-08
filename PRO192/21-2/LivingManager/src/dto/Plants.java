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
public class Plants extends LivingGroup{
    private int year;

    public Plants(int year, String name) {
        super(name);
        this.year = year;
    }

    public Plants() {
        super();
        year = 0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void growBy(){
        System.out.println("Grow by light");
    }
}
