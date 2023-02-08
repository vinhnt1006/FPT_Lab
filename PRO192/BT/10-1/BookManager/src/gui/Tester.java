/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Book;
import java.util.Scanner;

/**
 *
 * @author NK
 */
public class Tester {

    public static void main(String[] args) {
        int choice;
        Book bk = null;
        do {
            System.out.println("1. Input a book.");
            System.out.println("2. Output the book.");
            System.out.println("3. Update id of the book.");
            System.out.println("4. Update title of the book.");
            System.out.println("5. Update publishing company of the book.");
            System.out.println("6. Exit.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bk = new Book();
                    bk.inputBook();
                    break;
                case 2:
                    if (bk != null) {
                        bk.outputBook();
                    } else {
                        System.out.println("Book does not exist.");
                    }
                    break;
                case 3:
                    sc = new Scanner(System.in);
                    System.out.println("Input new id of the book.");
                    String mId = sc.next();
                    if (bk != null) {
                        bk.setId(mId);
                        System.out.println("after update: ");
                        bk.outputBook();
                    } else {
                        System.out.println("Id book does not exist.");
                    }
                    break;
                case 4:
                    sc = new Scanner(System.in);
                    System.out.println("Input new title of the book.");
                    String mTitle = sc.next();
                    if (bk != null) {
                        bk.setTitle(mTitle);
                        System.out.println("after update: ");
                        bk.outputBook();
                    } else {
                        System.out.println("Title book does not exist.");
                    }
                    break;
                case 5:
                    sc = new Scanner(System.in);
                    System.out.println("Input new publishing company of the book.");
                    String mPCompany = sc.next();
                    if (bk != null) {
                        bk.setPCompany(mPCompany);
                        System.out.println("after update: ");
                        bk.outputBook();
                    } else {
                        System.out.println("Publishing company book does not exist.");
                    }
                    break;
            }
        } while (choice <= 5);
        System.out.println("Exit!");
    }
}
