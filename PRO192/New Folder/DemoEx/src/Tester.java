/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author NK
 */
public class Tester {
    public static void main(String[] args) {
        boolean loi = false;
        do{
            try {
                int num;
                Scanner sc = new Scanner(System.in);
                System.out.println("Input num:");
                num = sc.nextInt();
                System.out.println("Div = " + 1.0/num);
                loi = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                loi = true;
            } catch(ArithmeticException e){
                System.out.println("Error: " + e.getMessage());
                loi = true;
            }
        }while(loi);
    }
}
