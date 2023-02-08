/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Student;
import dto.StudentSet;
import mylib.Valid;

/**
 *
 * @author NK
 */
public class Tester2 {
    public static void main(String[] args) {
        StudentSet std = new StudentSet();
        std.addStudent(new Student(20, "A"));
        std.addStudent(new Student(21, "V"));
        std.addStudent(new Student(2, "Y"));
        std.addStudent(new Student(10, "T"));
        std.addStudent(new Student(21, "G"));
        System.out.println("DSSV:");
        std.displayAll();
        System.out.println("Input Id");
        try {
            int id = Valid.inputNum("Input new ID");
            if(std.updateStudent(id)){
                System.out.println("After update");
                std.displayAll();
            }
            else System.out.println("No update");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
