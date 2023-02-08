/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.test;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Employee4 {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    // Constructor
    public Employee4(int id, String firstName , String lastName , int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
               
    }
    // getter setter
    public int getID() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    
    public String getName() {
        return getFirstName() +" "+ getLastName();
    }
    
    public int getSalary() {
        return salary;
    }
    
    public int getAnnualSalary() { 
        return getSalary() * 12;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int raiseSalary(int percent) {
        salary += salary * percent /100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id= " + id +
                ", name = " + firstName + " " + lastName +
                ", salary = " + salary + "]";
                
    }
    
    
}
