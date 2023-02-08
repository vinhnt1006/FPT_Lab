/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylib;

import dto.Item;
import dto.Statue;
import dto.Vase;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author NK
 */
public class FileDAO {

    public static ArrayList<Item> loadData(String filename) throws IOException {
        FileReader f = new FileReader(filename);
        BufferedReader bf = new BufferedReader(f);
        ArrayList<Item> List = new ArrayList<>();
        while (bf.ready()) {
            String s = bf.readLine();
            String[] arr = s.split(";");
            if (arr.length == 5) {
                Item it = null;
                if (arr[arr.length - 1].equals("1")) {
                    it = new Vase(Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[0]), arr[1]);
                } else {
                    it = new Statue(Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[0]), arr[1]);
                }
                List.add(it);
            }
        }
        f.close();
        bf.close();
        return List;
    }

    public static void writeData(String filename, ArrayList<Item> list) throws IOException {
        PrintWriter w = new PrintWriter(filename);
        for (Item item : list) {
            if (item instanceof Vase) {
                w.println(item.getValue() + ";" + item.getCreator() + ";" + ((Vase) item).getHeight() + ";" + ((Vase) item).getMaterial() + ";1");
            } else if (item instanceof Statue) {
                w.println(item.getValue() + ";" + item.getCreator() + ";" + ((Statue) item).getWeight() + ";" + ((Statue) item).getColour() + ";2");
            }
        }
        w.close();
    }

    public static void writeBinaryData(String filename, ArrayList<Item> list) throws Exception {
        FileOutputStream f = new FileOutputStream(filename);
        ObjectOutputStream of = new ObjectOutputStream(f);
        of.writeObject(list);
        f.close();
        of.close();
    }

    public static ArrayList<Item> loadBinaryData(String filename) throws Exception {
        ArrayList<Item> result = null;
        File file = new File(filename);
        if (!file.exists()) {
            FileOutputStream tmp = new FileOutputStream(filename);
            if (tmp != null) {
                tmp.close();
            }
            return result;
        }
        file.createNewFile();
        FileInputStream f = new FileInputStream(filename);
        ObjectInputStream of = new ObjectInputStream(f);
        if (of.available() > 0) {
            result = (ArrayList<Item>) of.readObject();
        }
        f.close();
        of.close();
        return result;
    }
}
