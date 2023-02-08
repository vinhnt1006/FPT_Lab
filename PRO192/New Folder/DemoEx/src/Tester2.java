
import mylib.Valid;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class Tester2 {
    public static void main(String[] args) throws Exception {
        try{
        int price = Valid.inputNum("Input price"); //price >=0
            System.out.println("Price = " + price);
        }
        catch(Exception e){
            System.out.println("Price = null");
        }
    }
}
