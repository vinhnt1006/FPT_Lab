/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class demo {

    private String name;
    static int x = 10;

    static {
        x = 20;
        System.out.println("ZZ");
    }

    public demo() {
        name = "QQ";
        x = 80;
    }
    
    public void output(){
        System.out.println("name: " + name);
        System.out.println("X: " + x);
    }
    
    public static void main(String[] args) {
        demo tmp = new demo();
        tmp.output();
    }
}
