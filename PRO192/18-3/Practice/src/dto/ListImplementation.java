/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.List;

/**
 *
 * @author NK
 */
public class ListImplementation implements IList {

    @Override
    public boolean addPerson(List<Person> list, Person p) {
        if (p != null) {
            list.add(p);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void displayAll(List<Person> list) {
        if(list != null) System.out.println(list);
    }

    @Override
    public Person find(List<Person> list, String code) {
        for (Person person : list) {
            if(person.getCode().equals(code)){
                return person;
            }
        }
        return null;
    }

}
