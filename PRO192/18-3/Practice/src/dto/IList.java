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
public interface IList {
    public boolean addPerson(List<Person> list, Person p);
    public void displayAll(List<Person> list);
    public Person find(List<Person> list, String code);
}
