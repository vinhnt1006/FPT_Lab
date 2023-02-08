/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.ArrayList;
import java.util.Collections;
import mylib.FileDAO;

/**
 *
 * @author Razer Blade
 */
public class Inventory {

    private ArrayList<Item> list;

    public Inventory() {
        list = new ArrayList<>();
    }

    public Inventory(String filename) {
        try {
            //list=FileDAO.loadData(filename);
            list = FileDAO.loadData(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getList() {
        return list.size();
    }

    public boolean addItem(Item it) {
        return list.add(it);
    }

    public int findItembyValue(int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateItembyIndex(int index) {
        if (index < 0 || index >= list.size()) {
            return false;
        }
        list.get(index).inputItem();
        return true;
    }

    public Item removeItembyIndex(int index) {
        return list.remove(index);
    }

    public void sortbyValue() {
        Collections.sort(list);
    }

    public void displayAll() {
        int count = 1;
        for (Item item : list) {
            System.out.print(count + ".");
            item.outItem();
            count++;
        }
    }

    public void backup(String filename) {
        try {
            //FileDAO.writeData(filename, list);
            FileDAO.writeBinaryData(filename, list);
            System.out.println("BACKUP!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
