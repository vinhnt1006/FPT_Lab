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
public class Circle extends Shape{
    private double Radius;

    public Circle() {
        super();
        Radius = 1.0;
    }
    
    public Circle(double Radius){
        super();
        this.Radius = Radius;
    }
    
    public Circle(double Radius, String Colour, boolean Filled) {
        super(Colour, Filled);
        this.Radius = Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }
    
    public double getArea(){
        return Radius * Radius * Math.PI;
    }
    
    public double getPerimeter(){
        return Radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + "Radius: " + Radius + "\n" + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
}
