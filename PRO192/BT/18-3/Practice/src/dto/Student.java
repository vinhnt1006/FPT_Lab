package dto;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class Student extends Person{
    double grade;

    public Student(String code, String name, String address, double grade) {
        super(code, name, address);
        this.grade = grade;
    }

    public Student(double grade) {
        super();
        grade = 0.0;
    }

    @Override
    public String toString() {
        return getName().toString() + "\ngrade= " + grade;
    }

}
