/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.MyMap;

/**
 *
 * @author NK
 */
public class Tester {

    public static void main(String[] args) {
        String filename = "WordsList.txt";
        String filenameBackup = "Backup.txt";
        MyMap m = new MyMap();
        m.init(filename);
        m.displayAll();
        m.backupData(filenameBackup);
//        m.displayAll();
//        System.out.println("\n");
//        String newWord = "anna";
//        if (m.addWord(newWord) == true) {
//            m.displayAll();
//        } else {
//            System.out.println("No added");
//        }
//        System.out.println("\n");
//        String newWord2 = "Zzz";
//        if (m.addWord(newWord2) == true) {
//            m.displayAll();
//        } else {
//            System.out.println("No added");
//        }
//        System.out.println("\n");
//        String newWord3 = "cf";
//        if (m.addWord(newWord3) == true) {
//            m.displayAll();
//        } else {
//            System.out.println("No added");
//        }
//        System.out.println("\n");
//        String r1 = "internet";
//        if (m.removeWord(r1)) {
//            m.displayAll();
//        } else {
//            System.out.println("No remove");
//        }
//        System.out.println("\n");
//        String r2 = "a";
//        if (m.removeWord(r2)) {
//            m.displayAll();
//        } else {
//            System.out.println("No remove");
//        }
//        System.out.println("\n");
//        String r3 = "cut";
//        if (m.removeWord(r3)) {
//            m.displayAll();
//        } else {
//            System.out.println("No remove");
//        }
//        System.out.println("\n");
//        String fw = "can";
//        if(m.findWord(fw)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//        String fw2 = "tt";
//        if(m.findWord(fw2)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//        System.out.println("\n");
//        System.out.println("Max group: " + m.getMaxGroup());
//        System.out.println("\n");
//        System.out.println("Max size: " + m.findMaxSize("a"));
//        System.out.println("\n");
//        System.out.println("Min size: " + m.findMinSize());
//        System.out.println("\n");
//        System.out.println("Palindrome: ");
//        m.displayPalindrome();
//        if (m.updateWord("an", "unban")) {
//            m.displayAll();
//        } else {
//            System.out.println("No update");
//        }
//        if (m.updateWord("op", "kk")) {
//            m.displayAll();
//        } else {
//            System.out.println("No update");
//        }
    }
}
