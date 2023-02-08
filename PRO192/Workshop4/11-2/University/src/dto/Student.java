/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Scanner;

/**
 *
 * @author NK
 */
public class Student extends Person {

    private double mark;
    private Dog pet;
    private Laptop laptop;

    public Student() {
        super();
        mark = 0;
    }

    public Student(double mark, Dog pet, Laptop laptop, int Id, String Name, String gender) {
        super(Id, Name, gender);
        this.mark = mark;
        this.pet = pet;
        this.laptop = laptop;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Dog getPet() {
        return pet;
    }

    public void setPet(Dog pet) {
        this.pet = pet;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

//    public void inputStudent() {
//        inputPerson();
//        // input mark
//        System.out.println("Input pet?[Y/n]");
//        Scanner sc = new Scanner(System.in);
//        String ans = sc.nextLine();
//        if (ans.equalsIgnoreCase("Y")) {
//            if (pet == null) {
//                pet = new Dog();
//            }
//            pet.inputDog();
//        }
//        System.out.println("Input Laptop?[Y/n]");
//        String ansLap = sc.nextLine();
//        if (ansLap.equalsIgnoreCase("Y")) {
//            if (laptop == null) {
//                laptop = new Laptop();
//            }
//            laptop.inputLaptop();
//        }
//    }
//
//    public void outputStudent() {
//        outputPerson();
//        //out mark
//        if (pet != null) {
//            pet.outputDog();
//        }
//        
//        if(laptop != null){
//            laptop.outputLaptop();
//        }
//    }
    @Override
    public void outputPerson() {
        super.outputPerson(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Input pet?[Y/n]");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("Y")) {
            if (pet == null) {
                pet = new Dog();
            }
            pet.inputDog();
        }
        System.out.println("Input Laptop?[Y/n]");
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
        if (pet != null) {
            pet.outputDog();
        }

        if (laptop != null) {
            laptop.outputLaptop();
        }
    }

}
