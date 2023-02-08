/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Class.test.Circle1;
/**
 *
 * @author PHAM KHAC VINH
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        Circle1 c2 = new Circle1();
        
        
        // test bai 1
        c1.setRadius(4.0);
        System.out.println(c1.getRadius());
        System.out.printf("The area of c1 is : %.2f%n ",c1.getArea());
        System.out.printf("The circumference of c1 is : %2f%n" ,c1.getCircumference());
        System.out.println("---------------------------------");
        
        // test c2 
        c2.setRadius(3);
        System.out.println(c2.getRadius());
        System.out.printf("Size of c2 = %.3f%n",c2.getArea());
        System.out.printf("The circumference of c2 = %.3f%n ", c2.getCircumference());
    }
    
}
