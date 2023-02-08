/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Student;
import java.util.Scanner;

/**
 *
 * @author NK
 */
public class Tester {

    public static void main(String[] args) {
        int choice;
        Student std = null;
        do {
            System.out.println("1. Input a student.");
            System.out.println("2. Output the student.");
            System.out.println("3. Update name of the student.");
            System.out.println("4. Update id of the student.");
            System.out.println("5. Exit.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    std = new Student();
                    std.inputStudent();
//                    int id = 200;
//                    String name = "DV";
//                    std = new Student(id, name);
                    break;
                case 2:
                    if (std != null) {
                        std.outputStudent();
                    } else {
                        System.out.println("Student does not exist.");
                    }
                    break;
                case 3:
                    sc = new Scanner(System.in);
                    System.out.println("Input a name to update");
                    String mName = sc.next();
                    if (std != null) {
                        std.setName(mName);
                        System.out.println("after update: ");
                        std.outputStudent();
                    } else {
                        System.out.println("Student does not exist.");
                    }
                    break;
                case 4:
                    System.out.println("Input a name to update");
                    int mId = sc.nextInt();
                    if (std != null) {
                        std.setId(mId);
                        System.out.println("after update: ");
                        std.outputStudent();
                    } else {
                        System.out.println("Student does not exist.");
                    }
                    break;
            }
        } while (choice <= 4);
        System.out.println("Exit!");
    }
}
