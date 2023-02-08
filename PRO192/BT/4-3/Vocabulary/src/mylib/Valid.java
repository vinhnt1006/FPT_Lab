/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylib;

import java.util.Scanner;

/**
 *
 * @author NK
 */
public class Valid {

    public static int inputNum(String mess) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println(mess);
        num = sc.nextInt();
        if (num < 0) {
            throw new Exception();
        }
        return num;
    }

    public static String inputString(String mess) throws Exception {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println(mess);
        s = sc.nextLine();
        if (s.isEmpty()) {
            throw new Exception();
        }
        return s;
    }

    public static boolean inputBoolean(String mess) throws Exception {
        boolean ok = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(mess);
        ok = sc.nextBoolean();
        if (!ok) {
            throw new Exception();
        }
        return ok;
    }
}
