/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import file.MyLib;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author NK
 */
public class MyMap {

    private HashMap<String, TreeSet<String>> h;

    public MyMap() {
        h = new HashMap<>();
    }

//    public void init() {
//        TreeSet<String> g1 = new TreeSet<>();
//        g1.add("apple");
//        g1.add("ant");
//        g1.add("arm");
//        g1.add("an");
//        h.put("a", g1);
//        TreeSet<String> g2 = new TreeSet<>();
//        g2.add("book");
//        g2.add("bomb");
//        g2.add("bay");
//        g2.add("by");
//        g2.add("boc");
//        h.put("b", g2);
//        TreeSet<String> g3 = new TreeSet<>();
//        g3.add("cat");
//        g3.add("cut");
//        g3.add("cft");
//        h.put("c", g3);
//    }
    public void init(String filename) {
        try {
            ArrayList<String> list = MyLib.loadData(filename);
//            System.out.println(list);
            for (String string : list) {
                String c = string.substring(0, 1);
                c = c.toLowerCase();
                TreeSet<String> newWord = h.get(c);
                if (h.containsKey(c) == false) {
                    newWord = new TreeSet<String>();
                    newWord.add(string);
                    h.put(c, newWord);
                } else {
                    newWord.add(string);
                    h.put(c, newWord);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayAll() {
        Collection<TreeSet<String>> values = h.values();
        for (TreeSet<String> value : values) {
            for (String string : value) {
                System.out.print(string + "; ");
            }
            System.out.println("\n");
        }
    }

    public boolean addWord(String word) {
        String c = word.substring(0, 1);
        c = c.toLowerCase();
        TreeSet<String> newWord = h.get(c);
        if (newWord != null && newWord.contains(word)) {
            return false;
        } else {
            if (h.containsKey(c) == false) {
                newWord = new TreeSet<String>();
                newWord.add(word);
                h.put(c, newWord);
            } else {
                newWord.add(word);
                h.put(c, newWord);
            }
            return true;
        }
    }

    public boolean removeWord(String word) {
        if (word.length() == 1) {
            if (h.containsKey(word)) {
                h.remove(word);
                return true;
            } else {
                return false;
            }
        } else {
            String c = word.substring(0, 1);
            c = c.toLowerCase();
            TreeSet<String> newWord = h.get(c);
            if (newWord != null && newWord.contains(word)) {
                newWord.remove(word);
                h.put(c, newWord);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean findWord(String word) {
        String c = word.substring(0, 1);
        c = c.toLowerCase();
        TreeSet<String> newWord = h.get(c);
        if (newWord == null) {
            return false;
        } else {
            if (newWord.contains(word)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public TreeSet<String> getMaxGroup() {
        Collection<TreeSet<String>> values = h.values();
        int maxGroup = 0;
        TreeSet<String> Group = null;
        for (TreeSet<String> value : values) {
            if (value.size() > maxGroup) {
                maxGroup = value.size();
                Group = value;
            }
        }
        return Group;
    }

    public String findMaxSize(String group) {
        Collection<TreeSet<String>> values = h.values();
        int maxGroup = 0;
        String Group = null;
        for (TreeSet<String> value : values) {
            for (String string : value) {
                if (string.length() > maxGroup) {
                    maxGroup = string.length();
                    Group = string;
                }
            }
        }
        return Group;
    }

    public String findMinSize() {
        Collection<TreeSet<String>> values = h.values();
        int minGroup = Integer.MAX_VALUE;
        String Group = null;
        for (TreeSet<String> value : values) {
            if (value.size() < minGroup) {
                minGroup = value.size();
                Group = value.first();
            }
        }
        return Group.substring(0, 1);
    }

    public void displayPalindrome() {
        boolean check = false;
        Collection<TreeSet<String>> values = h.values();
        for (TreeSet<String> value : values) {
            for (String string : value) {
                char ch[] = string.toCharArray();
                String rev = "";
                for (int i = ch.length - 1; i >= 0; i--) {
                    rev += ch[i];
                }
                if (string.equals(rev)) {
                    System.out.println("String: " + string);
                    check = true;
                }
            }
        }
        if (check == false) {
            System.out.println("null");
        }
    }

    public boolean updateWord(String oldWord, String newWord) {
        if (findWord(oldWord) == false) {
            return false;
        } else {
            String c = oldWord.substring(0, 1);
            TreeSet<String> nWord = h.get(c);
            if (nWord != null && nWord.contains(oldWord)) {
                nWord.remove(oldWord);
                h.put(c, nWord);
            } else {
                return false;
            }
            String c2 = newWord.substring(0, 1);
            TreeSet<String> nWord2 = h.get(c2);
            if (nWord2 != null && nWord2.contains(newWord)) {
                return false;
            } else {
                if (h.containsKey(c2) == false) {
                    nWord2 = new TreeSet<String>();
                    nWord2.add(newWord);
                    h.put(c2, nWord2);
                } else {
                    nWord2.add(newWord);
                    h.put(c2, nWord2);
                }
                return true;
            }
        }
    }

    public void backupData(String filename) {
        try {
            MyLib.writeTextFile(filename, h);
            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
