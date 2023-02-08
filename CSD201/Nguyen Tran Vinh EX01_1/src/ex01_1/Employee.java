/* Class for an employee*/
package ex01_1;
public class Employee implements Comparable<Employee> {
    String code="";
    String name="";
    int salary=0;    

    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        Employee aE = (Employee) obj;
        return this.code.equals(aE.code);
    }
    
    @Override
    public int compareTo(Employee o) {
        return this.code.compareTo(o.code);
    }
    
    @Override
    public String toString() {
        return code + "," + name + "," + salary;  
    }
}
