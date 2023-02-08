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
public class Shape {
    private String Colour = "red";
    private boolean Filled = true;

    public Shape() {
        Colour = "red";
        Filled = true;
    }
    
    public Shape(String Colour, boolean Filled){
        this.Colour = Colour;
        this.Filled = Filled;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean Filled) {
        this.Filled = Filled;
    }

    @Override
    public String toString() {
        return "Colour: " + Colour + "\n" + "Filled: " + Filled + "\n"; //To change body of generated methods, choose Tools | Templates.
    }

}
