/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Item;
import dto.Painting;
import dto.Statue;
import dto.Vase;
import java.util.Scanner;
import mylib.Valid;

/**
 *
 * @author NK
 */
public class Tester {

    public static void main(String[] args) {
        Item item = null;
        Vase vase = null;
        Statue stt = null;
        Painting paint = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.println("5. Exit");
            try {
                choice = Valid.inputNum("Input a choice:");
            } catch (Exception e) {
                System.out.println("Error");
            }
            switch (choice) {
                case 1:
                    vase = new Vase();
                    vase.inputItem();
                    item = new Vase();
                    item.inputItem();
                    break;
                case 2:
                    stt = new Statue();
                    stt.inputItem();
                    item = new Statue();
                    item.inputItem();
                    break;
                case 3:
                    paint = new Painting();
                    paint.inputItem();
                    item = new Painting();
                    item.inputItem();
                    break;
                case 4:
//                    if (item != null) {
//                        if (item instanceof Vase) {
//                            ((Vase) item).outputVase();
//                        } else if (item instanceof Statue) {
//                            ((Statue) item).outputStatue();
//                        } else if (item instanceof Painting) {
//                            ((Painting) item).outputPainting();
//                        }
//                    } else {
//                        System.out.println(" you need to create an object");
//                    }
//                    break;
//                    if (vase != null) {
//                        vase.outputItem();
//                    }
//                    if (stt != null) {
//                        stt.outputItem();
//                    }
//                    if (paint != null) {
//                        paint.outputItem();
//                    }
                    if (item != null) {
                        System.out.println(item);
                    }
                    break;
            }
        } while (choice <= 4);
    }
}
