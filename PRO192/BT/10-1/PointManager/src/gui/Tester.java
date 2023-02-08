/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Point;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author NK
 */
public class Tester {

    public static void main(String[] args) {
        int choice;
        Point pt1 = null;
        Point pt2 = null;
        Point pt3 = null;
        do {
            System.out.println("1. Input two Points.");
            System.out.println("2. Output two Points.");
            System.out.println("3. Get distance of two Points.");
            System.out.println("4. Update coordinates of first Point.");
            System.out.println("5. Update coordinates of second Point.");
            System.out.println("6. Exit.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    pt1 = new Point();
                    pt1.inputPoint();
                    pt2 = new Point();
                    pt2.inputPoint();
                    break;
                case 2:
                    if (pt1 != null && pt2 != null) {
                        pt1.outputPoint();
                        pt2.outputPoint();
                    } else {
                        System.out.println("Point does not exist");
                    }
                    break;
                case 3:
                    if (pt1 != null && pt2 != null) {
                        System.out.format("Distance = %.3f\n", pt1.getDistance(pt2.getX(), pt2.getY()));
                        System.out.format("Distance = %.3f\n", pt1.getDistance2(pt2));
                    } else {
                        System.out.println("Point does not exist");
                    }
                    break;
                case 4:
                    sc = new Scanner(System.in);
                    System.out.println("Input new coordinates of first Point.");
                    int newX1,
                     newY1;
                    newX1 = sc.nextInt();
                    newY1 = sc.nextInt();
                    if (pt1 != null) {
                        pt1.setX(newX1);
                        pt1.setY(newY1);
                        System.out.println("after update: ");
                        pt1.outputPoint();
                    } else {
                        System.out.println("Student does not exist.");
                    }
                    break;
                case 5:
                    sc = new Scanner(System.in);
                    System.out.println("Input new coordinates of first Point.");
                    int newX2,
                     newY2;
                    newX2 = sc.nextInt();
                    newY2 = sc.nextInt();
                    if (pt2 != null) {
                        pt2.setX(newX2);
                        pt2.setY(newY2);
                        System.out.println("after update: ");
                        pt2.outputPoint();
                    } else {
                        System.out.println("Point does not exist.");
                    }
                    break;
            }
        } while (choice <= 5);
        System.out.println("Exit!");
        Point pt4 = new Point(pt2);
        System.out.println("New Point: ");
        pt4.outputPoint();
    }
}
