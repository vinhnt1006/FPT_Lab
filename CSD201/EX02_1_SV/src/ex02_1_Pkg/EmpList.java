/* Class for a list of employees */
package ex02_1_Pkg;

import java.util.Collections;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;

public class EmpList extends TreeSet<Employee> implements I_List {

    public static Scanner sc = new Scanner(System.in);

    public EmpList() {
        super();
    }

    @Override
    /* Add new item, data will be input from keyboard 
       Input format:
    Code:E001
    Name:Michel
    Salary:500
    Attention: Employee code anf name must be converted to uppercase
     */
    public void addItem() {
        String code;
        String name;
        int salary;
        System.out.print("Code: ");
        code = sc.nextLine().toUpperCase();
        System.out.print("Name: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Salary: ");
        salary = Integer.valueOf(sc.nextLine());
        Employee emp = new Employee(code, name, salary);
        this.add(emp);
        System.out.println();
    }

    @Override
    /* Search an employee based on employee's code
       Employee's code will be input from keyboard
       Input format: Searched code:E001
       If the data is not found, the string "This employee does not exist!",
       Else, data of the item is printed out.
     */
    public void searchItem() {
        System.out.print("Searched code:");
        String sCode;
        sCode = sc.nextLine().toUpperCase();
        for (Employee thi : this) {
            if (thi.code.equals(sCode)) {
                System.out.println(thi);
                return;
            }
        }
        System.out.println("This employee does not exist!");
    }

    @Override
    /* Remove an item, data will be input from keyboard
    Input format: Removed code:E001
       If the item is not found, 
             the string "This employee does not exist!" is printede out;
       Else, the string "This employee has been removed." is printed out.
     */
    public void removeItem() {
        String sCode;
        sCode = sc.nextLine().toUpperCase();
        for (Employee thi : this) {
            if (thi.code.equalsIgnoreCase(sCode)) {
                this.remove(thi);
                System.out.println("This employee has been removed.");
                return;
            }
        }
        System.out.println("This employee does not exist!");
    }

    @Override
    /* Print the list in ascending order
       If the list is empty, the string "Empty list." is printed out,
       Else, all items are printed out line-by-line. 
     */
    public void printAscendingOrder() {
        if (this.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            for (Employee thi : this) {
                System.out.println(thi);
            }
        }
    }

    /* Print the list in descending order
       If the list is empty, the string "Empty list." is printed out,
       Else, all items are printed out line-by-line. 
     */
    @Override
    public void printDescendingOrder() {
        TreeSet<Employee> res = (TreeSet<Employee>) this.descendingSet();
        for (Employee thi : res) {
            System.out.println(thi);
        }
    }
} // EmpList class

