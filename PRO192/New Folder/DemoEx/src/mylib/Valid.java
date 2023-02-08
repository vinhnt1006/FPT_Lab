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
    public static int inputNum(String x) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println(x);
        num = sc.nextInt();
        if (num < 0) throw new Exception();
        return num;
    }
}
