/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Inventory;
import dto.Item;
import dto.Painting;
import dto.Statue;
import dto.Vase;
import mylib.Valid;

/**
 *
 * @author NK
 */
public class Store {

    public static void main(String[] args) {
        int choice = 0;
        Item it = null;
        Inventory Obj = new Inventory();
        do {
            System.out.println("1. Add a new Vase to Inventory");
            System.out.println("2. Add a new Statue to Inventory");
            System.out.println("3. Add a new Painting to Inventory");
            System.out.println("4. Display all items in the Inventory");
            System.out.println("5. Update Item by Index");
            System.out.println("6. Remove the item in the Inventory");
            System.out.println("7. Sort all items by value");
            System.out.println("8. Input Customer");
            System.out.println("9. Purchase");
            System.out.println("10. Delete Item in cart");
            System.out.println("11. Display Customer");
            try {
                choice = Valid.inputNum("Input a choice: ");
            } catch (Exception e) {
                System.out.println("Error");
            }
            switch (choice) {
                case 1:
                    it = new Vase();
                    it.inputItem();
                    if (Obj.addItem(it)) {
                        System.out.println("Added");
                    } else {
                        System.out.println("Add error");
                    }
                    break;
                case 2:
                    it = new Statue();
                    it.inputItem();
                    if (Obj.addItem(it)) {
                        System.out.println("Added");
                    } else {
                        System.out.println("Add error");
                    }
                    break;
                case 3:
                    it = new Painting();
                    it.inputItem();
                    if (Obj.addItem(it)) {
                        System.out.println("Added");
                    } else {
                        System.out.println("Add error");
                    }
                    break;
                case 4:
                    if (Obj.getCount() == 0) {
                        System.out.println("The Inventory is empty");
                    } else {
                        Obj.displayAll();
                    }
                    break;
                case 5:
                    int index;
                    try {
                        index = Valid.inputNum("Input index: ");
                        if (Obj.updateItemByIndex(index)) {
                            System.out.println("After updating: ");
                            Obj.displayAll();
                        } else {
                            System.out.println("No Update");
                        }
                    } catch (Exception e) {
                        System.out.println("Error Index");
                    }
                    break;
                case 6: 
                    try {
                    index = Valid.inputNum("Input index");
                    if (Obj.removeItem(index)) {
                        System.out.println("After removing");
                        Obj.displayAll();
                    } else {
                        System.out.println("No Remove");
                    }
                } catch (Exception e) {
                    System.out.println("Error index");
                }
                break;
                case 7:
                    Obj.sortByValue();
                    System.out.println("After sorting");
                    Obj.displayAll();
                    break;
            }
        } while (choice >= 7);
    }
}
