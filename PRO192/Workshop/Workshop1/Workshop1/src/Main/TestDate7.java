/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Class.test.Date7;
/**
 *
 * @author PHAM KHAC VINH
 */
public class TestDate7 {
    public static void main(String[] args) {
         // Test constructor and toString()
      Date7 d1 = new Date7(28, 5, 2021);
        System.out.println(d1);
        System.out.println("---------------------");
        d1.setDate(1, 6, 2021);
        System.out.println(d1);
      
    }
    
}
