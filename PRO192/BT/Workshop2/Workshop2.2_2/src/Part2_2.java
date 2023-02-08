/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author NK
 */
public class Part2_2 {

    public String inputString() throws Exception {
        String pattern = "SE212";
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string: ");
        s = sc.nextLine();
        if (!s.matches(pattern)) {
            throw new Exception();
        }
        return s;
    }

    public static void main(String[] args) {
        Part2_2 obj = new Part2_2();
        boolean cont = false;
        do {
            try {
                String s = obj.inputString();
                System.out.println("the string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("the string is invalid");
                cont = true;
            }
        } while (cont);
    }
}
