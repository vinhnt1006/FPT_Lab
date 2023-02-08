/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Class.test.Regtangle3;

/**
 *
 * @author PHAM KHAC VINH
 */
public class TestRectangle3 {

    public static void main(String[] args) {
        Regtangle3 r1 = new Regtangle3();
        Regtangle3 r2 = new Regtangle3();
        
        //test r1 ;
        r1.setLength(1);
        r1.setWidth(2);
        System.out.println("Area of r1 = " + r1.getArea());
        System.out.println("Perimeter r1 = " + r1.getPerimeter());
        System.out.println("----------------------------");
        

        //test r2
        r2.setLength(3);
        r2.setWidth(4);
        System.out.println("Area of r2 = " + r2.getArea());
        System.out.println("Perimeter r2 = " + r2.getPerimeter());
        
    }

}
