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
public class Part3 {

    public static void main(String[] args) {
        String[] list = new String[10];
        System.out.println("Enter list of names:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Name[" + (i + 1) + "]: ");
            Scanner sc = new Scanner(System.in);
            list[i] = sc.nextLine();
            char[] names = list[i].toCharArray();
            names[0] = Character.toUpperCase(names[0]);
            list[i] = String.valueOf(names);
        }
        System.out.println("List of names after uppercase first character: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Name[" + (i + 1) + "]: ");
            System.out.println(list[i]);
        }
    }
}
