/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author NK
 */
/* Manager item by array*/
public class Inventory {

    private int count;
    private Item[] arr;
    private final int MAX = 5;

    //constructor
    public Inventory() {
        arr = new Item[MAX];
        count = 0;
    }

    //add
    public boolean addItem(Item it) {
        if (count >= MAX) {
            return false;
        }
        arr[count] = it;
        count++;
        return true;
    }

    public void displayAll() {
        System.out.println("/----------------------/");
        System.out.format("%5d%5d%10s%5d%10s", "STT", "VALUE", "CREATOR", "HEIGHT", "MATERIAL");
        for (int i = 0; i < count; i++) {
            //arr[i].outputItem();
            System.out.print(i + 1 + ".");
            System.out.println(arr[i]);
        }
        System.out.println("/----------------------/");
    }

    public int getCount() {
        return count;
    }

    public int searchItemByValue(int value) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getValue() == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateItemByIndex(int index) {
        if (index < 0 || index >= count) {
            return false;
        }
        arr[index].inputItem();
        return true;
    }

    public boolean removeItem(int index) {
        if (index < 0 || index >= count) {
            return false;
        }
        for (int i = index; i < count; i++) {
            arr[i] = arr[i + 1];
        }
        count--;
        return true;
    }
    
//    public Item removeItem(int index) {
//        if (index < 0 || index >= count) {
//            return null;
//        }
//        Item tmp = arr[index];
//        for (int i = index; i < count; i++) {
//            arr[i] = arr[i + 1];
//        }
//        count--;
//        return tmp;
//    }

    public void sortByValue() {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i].getValue() > arr[j].getValue()) {
                    Item tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
