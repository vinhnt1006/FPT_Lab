/* Class for an employee*/
package ex02_1_Pkg;

public class Employee implements Comparable<Employee> {

    String code = "";
    String name = "";
    int salary = 0;

    /* Initialize an employee with employee code only */
    public Employee(String code) {
        this.code = code;
        this.name = "";
        this.salary = 0;
    }

    /* Initialize an employee with data */
    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    @Override
    /* Comparing two employees based on natural order of strings in their code*/
    public int compareTo(Employee emp) {
        return this.code.compareTo(emp.code);
    }

    // convert an employee to String
    @Override
    public String toString() {
        // You should not modify this method
        return code + ", " + name + ", " + salary;
    }
} // Employee class
