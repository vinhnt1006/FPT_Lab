/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import mylib.Valid;

/**
 *
 * @author NK
 */
public class Person {
    private  int Id;
    private String Name;
    private String gender;

    public Person() {
        Id = 0;
        Name = "";
        gender = "";
    }

    
    public Person(int Id, String Name, String gender) {
        this.Id = Id;
        this.Name = Name;
        this.gender = gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void inputPerson() {
        try {
            Id = Valid.inputNum("Input Id");
            Name = Valid.inputString("Input Name");
            gender = Valid.inputString("Input gender");
        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }
    
    public void outputPerson(){
        //outputStudent();
        
        System.out.println("Id:" + Id);
        System.out.println("Name:" + Name);
        System.out.println("gender:" + gender);
    }
}
