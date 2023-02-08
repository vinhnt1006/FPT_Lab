/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author NK
 */
public class University extends Organization {

    private String name;

    @Override
    void communicateByTool() {
        System.out.println("In the university, people communicate by voice");
    }

    public University(int size, String name) {
        super(size);
        this.name = name;
    }

    public University() {
        super();
        name = "";
    }

    public void enroll() {
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }

    public void educate() {
        System.out.println("Provide education at university standard");
    }

    @Override
    public String toString() {
        return "Encourage the advancement and development of knowledge";
    }

}
