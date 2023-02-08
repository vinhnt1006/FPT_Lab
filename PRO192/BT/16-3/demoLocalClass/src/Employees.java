/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class Employees {
    String name;
    int salary;

    public Employees(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employees() {
        name = "";
        salary = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String s = "Name: " + name;
        s = s + "\nSalary: " + salary;
        double income = salary * 25 - (0.05 * salary);
        ITax tmp = new ITax() {
            @Override
            public double getTax(double income) {
                return 0.1*income;
            }

            @Override
            public void printTax(double income) {
                System.out.println("\nTax: " + getTax(income));
            }
        };
        s = s + "\nTax: " + tmp.getTax(income);
        s = s + "\nIncome after tax: " + (income - tmp.getTax(income));
        return s;
    }
    
    
}
