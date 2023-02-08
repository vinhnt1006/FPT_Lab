/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Fraction;
import java.util.Scanner;

/**
 *
 * @author NK
 */
public class Tester {

    public static void main(String[] args) {
        int choice;
        Fraction f1 = null;
        Fraction f2 = null;
        Fraction f3 = null;
        do {
            System.out.println("1. Input two Fractions.");
            System.out.println("2. Output two Fractions.");
            System.out.println("3. Perform arithmetic operations between two fractions.");
            System.out.println("4. Update numerator of first fraction.");
            System.out.println("5. Update denominator of first fraction.");
            System.out.println("6. Update numerator of second fraction.");
            System.out.println("7. Update denominator of second fraction.");
            System.out.println("8. Exit.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    f1 = new Fraction();
                    f1.inputFraction();
                    f2 = new Fraction();
                    f2.inputFraction();
                    break;
                case 2:
                    if (f1 != null && f2 != null) {
                        f1.outputFraction();
                        f2.outputFraction();
                    } else {
                        System.out.println("Fraction does not exist");
                    }
                    break;
                case 3:
                    System.out.print("Enter the operation to be performed:");
                    sc = new Scanner(System.in);
                    String op = sc.next();
                    if (f1 != null && f2 != null) {
                        if (op != null && "+".equals(op)) {
                            System.out.println("Sum of two fraction = ");
                            f3 = f1.operatorAdd(f2);
                            f3.outputFraction();
                        } else if (op != null && "-".equals(op)) {
                            System.out.println("Difference of two fraction = ");
                            f3 = f1.operatorSub(f2);
                            f3.outputFraction();
                        } else if (op != null && "*".equals(op)) {
                            System.out.println("Product of two numbers = ");
                            f3 = f1.operatorMul(f2);
                            f3.outputFraction();
                        } else if (op != null && "/".equals(op)) {
                            System.out.println("Quotient of two fraction = ");
                            f3 = f1.operatorDiv(f2);
                            f3.outputFraction();
                        }
                    } else {
                        System.out.println("Fraction does not exist");
                    }
                    break;

                case 4:
                    sc = new Scanner(System.in);
                    System.out.println("Input new numerator for first fraction to update");
                    int numerator1 = sc.nextInt();
                    if (f1 != null) {
                        f1.setNumerator(numerator1);
                        System.out.println("after update: ");
                        f1.outputFraction();
                    } else {
                        System.out.println("Fraction does not exist.");
                    }
                    break;
                case 5:
                    sc = new Scanner(System.in);
                    System.out.println("Input new denominator for first fraction to update");
                    int denominator1 = sc.nextInt();
                    if (f1 != null) {
                        f1.setDenominator(denominator1);
                        System.out.println("after update: ");
                        f1.outputFraction();
                    } else {
                        System.out.println("Fraction does not exist.");
                    }
                    break;
                case 6:
                    sc = new Scanner(System.in);
                    System.out.println("Input new numerator for second fraction to update");
                    int numerator2 = sc.nextInt();
                    if (f2 != null) {
                        f2.setNumerator(numerator2);
                        System.out.println("after update: ");
                        f2.outputFraction();
                    } else {
                        System.out.println("Fraction does not exist.");
                    }
                    break;
                case 7:
                    sc = new Scanner(System.in);
                    System.out.println("Input new denominator for second fraction to update");
                    int denominator2 = sc.nextInt();
                    if (f2 != null) {
                        f2.setDenominator(denominator2);
                        System.out.println("after update: ");
                        f2.outputFraction();
                    } else {
                        System.out.println("Fraction does not exist.");
                    }
                    break;
            }
        } while (choice <= 7);
        System.out.println("Exit!");
    }
}
