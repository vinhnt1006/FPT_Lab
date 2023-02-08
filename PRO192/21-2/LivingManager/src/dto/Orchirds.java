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
public class Orchirds extends Plants{
    private int price;

    public Orchirds(int price, int year, String name) {
        super(year, name);
        this.price = price;
    }

    public Orchirds() {
        super();
        price = 0;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
