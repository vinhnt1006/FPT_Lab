/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.ListImplementation;
import dto.Person;
import java.util.ArrayList;

/**
 *
 * @author NK
 */
public class Tester {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        ListImplementation obj = new ListImplementation();
        // test method addPerson
        Person p = new Person("SE123", "QQ", "ZZZ");
        obj.addPerson(list, p);
        //test case 2:
        obj.displayAll(list);
        //test case 3
        Person rs = obj.find(list, "SE123");
        if (rs == null) {
            System.out.println("Not found");
        } else {
            System.out.println(rs);
        }
    }
}
