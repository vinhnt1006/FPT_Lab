/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class Tester {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        System.out.println(obj1);
        
        System.out.println("\n");
        
        Laptop obj2 = new Laptop(1, true, 12, "VN", "Dell");
        System.out.println(obj2);
        
        System.out.println("\n");
        
        Employees obj3 = new Employees("QQ", 100000);
        System.out.println(obj3);
    }
}
