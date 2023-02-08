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
public class Square extends Rectangle{
    private double Side;
    public Square() {
        super();
        Side = 0.0;
    }

    public Square(double Side) {
        super();
        this.Side = Side;
    }

    public Square(double Side, String Colour, boolean Filled) {
        this.Side = Side;
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double Side) {
        this.Side = Side;
    }

    @Override
    public void setLength(double Side) {
        super.setLength(Side); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWidth(double Side) {
        super.setWidth(Side); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + Side; //To change body of generated methods, choose Tools | Templates.
    }

}
