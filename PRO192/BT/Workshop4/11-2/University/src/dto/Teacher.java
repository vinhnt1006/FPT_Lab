/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import mylib.Valid;
import java.util.Scanner;

/**
 *
 * @author NK
 */
public class Teacher extends Person {

    private double exp;
    private Laptop laptop;

    public Teacher() {
        super();
        exp = 0;
    }

    public Teacher(int Id, String Name, Laptop laptop, String gender, int exp) {
        super(Id, Name, gender);
        this.exp = exp;
        this.laptop = laptop;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

//    public void inputTeacher() {
//        inputPerson();
//        try {
//            exp = Valid.inputNum("Input exp");
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//        System.out.println("Input Laptop?[Y/n]");
//        Scanner sc = new Scanner(System.in);
//        String ansLap = sc.nextLine();
//        if (ansLap.equalsIgnoreCase("Y")) {
//            if (laptop == null) {
//                laptop = new Laptop();
//            }
//            laptop.inputLaptop();
//        }
//    }
//
//    public void outputTeacher() {
//        outputPerson();
//        System.out.println("Exp:" + exp);
//        if (laptop != null) {
//            laptop.outputLaptop();
//        }
//    }
    @Override
    public void outputPerson() {
        try {
            super.outputPerson(); //To change body of generated methods, choose Tools | Templates.
            exp = Valid.inputNum("Input exp");
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Input Laptop?[Y/n]");
        Scanner sc = new Scanner(System.in);
        String ansLap = sc.nextLine();
        if (ansLap.equalsIgnoreCase("Y")) {
            if (laptop == null) {
                laptop = new Laptop();
            }
            laptop.inputLaptop();
        }

    }

    @Override
    public void inputPerson() {
        super.inputPerson(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Exp:" + exp);
        if (laptop != null) {
            laptop.outputLaptop();
        }
    }

}
