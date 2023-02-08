/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Scanner;
import mylib.Valid;

/**
 *
 * @author NK
 */
public class Student implements Comparable<Student>{

    //declare fields
    private int id;
    private String name;

    //declare methods
    public Student() {
        id = 0;
        name = null;
    }

    public Student(int mId, String mName) {
        id = mId;
        name = mName;
    }

    public void setName(String mName) {
        if (mName != null && !mName.isEmpty()) {
            name = mName;
        }
    }

    public void setId(int mId) {
        if (mId >= 0) {
            id = mId;
        }
    }

    public String getName() {
        name = name.toUpperCase();
        return name;
    }

    public int getId() {
        return id;
    }

    // input id from keyboard
    public void inputStudent() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input id:");
//        id = sc.nextInt();
//        sc = new Scanner(System.in);
//        System.out.println("input name:");
//        name = sc.nextLine();
        boolean err = false;
        do {
            try {
                id = Valid.inputNum("Input ID:");
                name = Valid.inputString("Input Name:");
                err = false;
            } catch (Exception e) {
                System.out.println("Data is invalid");
                err = true;
            }
        } while (err);
    }

    public void outputStudent() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println();
    }

    @Override
    public int compareTo(Student o) {
        if(id > o.getId()) return 1;
        else if(id < o.getId()) return -1;
        return 0;
    }
}
