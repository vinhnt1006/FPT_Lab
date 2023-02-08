/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Customer;
import dto.Inventory;
import dto.Item;
import dto.Painting;
import dto.Statue;
import dto.CustomerSet;
import dto.Vase;
import mylib.Valid;

public class Store {

    public static void main(String[] args) {
        int choice = 0;
        //Inventory khohang=new Inventory();
        //String filename="Database.txt";
        String filename = "ItemData.jar";
        Inventory khohang = new Inventory(filename);
        CustomerSet cus = new CustomerSet();
        do {
            System.out.println("1. Add a vase to the inventory");
            System.out.println("2. Add a statue to the inventory");
            System.out.println("3. Add a painting to the inventory");
            System.out.println("4. Display all items the inventory");
            System.out.println("5. Update the item by index");
            System.out.println("6. Remove the item from the inventory");
            System.out.println("7. Sort the inventory by value");
            System.out.println("8. Input information of customer");
            System.out.println("9. Purchase");
            System.out.println("10. Remove item in customer");
            System.out.println("11. Display customer");
            System.out.println("12. Find customer in range");
            System.out.println("13. Exit");
            try {
                choice = Valid.inputNum("Input a choice");
            } catch (Exception e) {
                System.out.println("Choice is invalid");
            }
            switch (choice) {
                case 1:
                    Item it = new Vase();
                    it.inputItem();
                    if (khohang.addItem(it)) {
                        System.out.println("Added");
                    } else {
                        System.out.println("Add failed");
                    }
                    break;
                case 2:
                    it = new Statue();
                    it.inputItem();
                    if (khohang.addItem(it)) {
                        System.out.println("Added");
                    } else {
                        System.out.println("Add failed");
                    }
                    break;
                case 3:
                    it = new Painting();
                    it.inputItem();
                    if (khohang.addItem(it)) {
                        System.out.println("Added");
                    } else {
                        System.out.println("Add failed");
                    }
                    break;
                case 4:
                    if (khohang.getList() == 0) {
                        System.out.println("The inventory is empty");
                    } else {
                        khohang.displayAll();
                    }
                    break;
                case 5:
                    int index;
                    try {
                        index = Valid.inputNum("Input a index to update");
                        if (khohang.updateItembyIndex(index)) {
                            System.out.println("After update");
                            khohang.displayAll();
                        } else {
                            System.out.println("no update");
                        }
                    } catch (Exception e) {
                        System.out.println("Error");
                    }
                    break;
                case 6:
                    try {
                    index = Valid.inputNum("Input a index to remove");
                    Item tmp = khohang.removeItembyIndex(index);
                    if (tmp != null) {
                        System.out.println("After remove");
                        khohang.displayAll();
                    } else {
                        System.out.println("no remove");
                    }
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;
                case 7:
                    System.out.println("After sorting");
                    khohang.sortbyValue();
                    khohang.displayAll();
                    break;
                case 8:
                    String id;
                    String name;
                    Customer cus1 = new Customer();
                    try {
                        id = Valid.inputString("Input a id");
                        name = Valid.inputString("Input a name");
                        cus1.setId(id);
                        cus1.setName(name);
                        cus.addCustomer(cus1);
                    } catch (Exception e) {
                        System.out.println("invalid");
                    }
                    break;
                case 9:
                    int position;
                    Item itxoa = new Item();
                    try {
                        id = Valid.inputString("Input a id of customer");
                        Customer cus2 = new Customer();
                        cus2 = cus.findCustomer(id);
                        khohang.displayAll();
                        position = Valid.inputNum("Input position");
                        itxoa = khohang.removeItembyIndex(position);
                        cus2.addtoCart(itxoa);
                    } catch (Exception e) {
                        System.out.println("invalid");
                    }
                    break;
                case 10:                 
                    try {
                    id = Valid.inputString("Input a id of customer");
                    Customer cus2 = new Customer();
                    cus2 = cus.findCustomer(id);
                    cus2.displayCustomer();
                    position = Valid.inputNum("Input position");
                    itxoa = cus2.removeItem(position);
                    if (itxoa != null) {
                        khohang.addItem(itxoa);
                    }
                } catch (Exception e) {
                    System.out.println("invalid");
                }
                break;
                case 11:
                    cus.displayAll();
                    System.out.println("VIP Customer:");
                    cus1 = cus.findVIPCustomer();
                    cus1.displayCustomer();
                    try {
                        int min, max;
                        min = Valid.inputNum("input min");
                        max = Valid.inputNum("Input max");
                        System.out.println("Customer has Item value > " + min + " and < " + max);
                        cus.displayCustomers(min, max);
                    } catch (Exception e) {
                        System.out.println("invalid");
                    }
                    break;
                default:
                    khohang.backup(filename);
                    break;
            }
        } while (choice <= 11);
    }
}
