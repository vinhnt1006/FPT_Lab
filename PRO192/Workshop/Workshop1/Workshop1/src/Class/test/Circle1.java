/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.test;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Circle1 {
    private double radius = 1.0;
    
    public Circle1()
    {
        
    }
    public Circle1(double radius)
    {
     this.radius = radius ;   
    }
    
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius ;
    }
    public double getArea(){
        return Math.PI * radius * radius;
        
    }
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle["+ radius + "]"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
    