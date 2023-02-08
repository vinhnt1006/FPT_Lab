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
public class Regtangle3 {
    private float length = 1.0f;
    private float width = 1.0f;
    
    public Regtangle3() {
        
    }
    
    public Regtangle3(float length , float width) {
        this.length = length;
        this.width = width;
    }
    
    public float getLength() {
        return length;
    }
    public void setLength (float length) {
        this.length = length;
    }
    
    public float getWidth() {
        return width;
        
    }
    public void setWidth(float width) {
        this.width =width;
    }
    
    public double getArea(){
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[length" + length + ",width = " + width +"]"   ; //To change body of generated methods, choose Tools | Templates.
    }
    
}
