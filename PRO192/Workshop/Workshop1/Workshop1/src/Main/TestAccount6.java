/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Class.test.Account6;
/**
 *
 * @author PHAM KHAC VINH
 */
public class TestAccount6 {
    public static void main(String[] args) {
        // Test constructor and toString()
      Account6 a1 = new Account6("HE153482" , "Pham Khac Vinh");
      System.out.println(a1);  // toString();
      Account6 a2 = new Account6("HE153481","Hoang Linh Long" , 99); // default balance
      System.out.println(a2);
        System.out.println("------------------------------");
        
        
      // test constructor
        System.out.println("The ID of a1 and a2 are : "+ a1.getID()+"  "+ a2.getID());
        System.out.println(":The Name of a1 and A2 are : " + a1.getName() + "  " + a2.getName());
        a1.credit(10); System.out.println(a1.getBalance());
        a2.credit(20); System.out.println(a2.getBalance());
        
        System.out.println("-------------------");
        System.out.println("The credit a1 = " +a1.credit(50));
        System.out.println("The credit a2 = "+ a2.credit(150));
        
        a1.transferTo(a2, 10);
        System.out.println(a1);
        System.out.println(a2);
    }
    
}
