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
public class Rectangle extends Shape{
    private double Width;
    private double Length;

    public Rectangle(){
        super();
        Width = 1.0;
        Length = 1.0;
    }
    
    public Rectangle(double Width, double Length) {
        super();
        this.Width = Width;
        this.Length = Length;
    }

    public Rectangle(double Width, double Length, String Colour, boolean Filled) {
        super(Colour, Filled);
        this.Width = Width;
        this.Length = Length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double Length) {
        this.Length = Length;
    }
    
    public double getArea(){
        return Width * Length;
    }
    
    public double getPerimeter(){
        return (Width + Length) * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "Width: " + Width + "\nLength: " + Length + "\n" + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
