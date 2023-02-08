/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;
import mylib.Valid;

/**
 *
 * @author NK
 */
public class StudentSet {

    TreeSet<Student> SSet = new TreeSet<>();

    public StudentSet() {
        SSet = new TreeSet<>();
    }

    public boolean addStudent(Student std) {
        return SSet.add(std);
    }

    public void displayAll() {
//        for (Student student : SSet) {
//            student.outputStudent();
//        }
//        Iterator<Student> it = SSet.descendingIterator();
        for (Iterator<Student> iterator = SSet.descendingIterator(); iterator.hasNext();) {
            Student next = iterator.next();
            next.outputStudent();
        }
    }

    public Student findStudent(int id) {
        for (Student student : SSet) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public boolean updateStudent(int id) {
        if (findStudent(id) == null) {
            return false;
        }
        try {
            findStudent(id).setName(Valid.inputString("input new name:"));
        } catch (Exception e) {
            System.out.println("Error");
        }
        return true;
    }

    public Student removeStudent(int id) {
        if (findStudent(id) == null) {
            return null;
        }
        SSet.remove(findStudent(id));
        return findStudent(id);
    }
}
