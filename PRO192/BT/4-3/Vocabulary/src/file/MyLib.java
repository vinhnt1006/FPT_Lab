/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author NK
 */
public class MyLib {

    public static ArrayList<String> loadData(String filename) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        FileReader f = new FileReader(filename);
        BufferedReader bf = new BufferedReader(f);
        while (bf.ready()) {
            list.add(bf.readLine().trim());

        }
        bf.close();
        f.close();
        return list;
    }
    
    public static void writeTextFile(String filename, HashMap<String, TreeSet<String>> h) throws IOException{
        PrintWriter w = new PrintWriter(filename);
        
        Collection<TreeSet<String>> values = h.values();
        for (TreeSet<String> value : values) {
            if(value.size() > 0){
                for (String string : value) {
                    w.println(string);
                }
            }
        }
        w.close();
    }
}
