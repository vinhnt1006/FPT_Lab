/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class DLL_Flower_Tester {
    public static void main(String[] args) {
        DLL_FlowerList list = new DLL_FlowerList();
        
        list.addFirst("Hung. Rose", "Hungary", 20);
        list.addFirst("Dalat Rose", "Viet Nam", 2);
        list.addLast("White Tulip", "Hungary", 10);
        list.addLast("Orchid", "French", 30);
        list.addLast("Gladiolus", "Viet Nam", 1);
        
        System.out.println("\nFlowers in the list: ");
        list.printAll();
        System.out.println("\nFlowers in the list, Reserver order: ");
        list.printReverse();
        System.out.println("\nFlowers from Hungary: ");
        list.printAll_Org("Hungary");
        System.out.println();
        
        String name = "Tigon";
        DLL_Node result = list.search(name);
        if (result == null) {
            System.out.println("Search " + name + ": Not found!");
        } else {
            System.out.println("Search: " + result.flower);
        }
        name = "Orchid";
        result = list.search(name);
        if (result == null) {
            System.out.println("Search " + name + ": Not found!");
        } else {
            System.out.println("Search: " + result.flower);
        }
        System.out.println();
        
        System.out.println("\nRemove first operation: ");
        list.removeFirst();
        System.out.println("\nFlowers in the list: ");
        list.printAll();
        System.out.println("\nRemove last operation: ");
        list.removeLast();
        System.out.println("\nFlowers in the list: ");
        list.printAll();
        
        System.out.println("\nSearch and remove: ");
        name = "Tigon";
        Flower f = list.remove(name);
        if (f == null) {
            System.out.println("Remove failed! " + name);
        } else {
            System.out.println("Remove successfully: " + f);
        }
        name = "White Tulip";
        f = list.remove(name);
        if (f == null) {
            System.out.println("Remove failed! " + name);
        } else {
            System.out.println("Remove successfully: " + f);
        }
        System.out.println("\nFlowers in the list: ");
        list.printAll();
    }
}
